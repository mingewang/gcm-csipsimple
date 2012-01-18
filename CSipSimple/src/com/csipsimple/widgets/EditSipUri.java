/**
 * Copyright (C) 2010-2012 Regis Montoya (aka r3gis - www.r3gis.fr)
 * This file is part of CSipSimple.
 *
 *  CSipSimple is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  If you own a pjsip commercial license you can also redistribute it
 *  and/or modify it under the terms of the GNU Lesser General Public License
 *  as an android library.
 *
 *  CSipSimple is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with CSipSimple.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.csipsimple.widgets;

import java.util.regex.Pattern;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.csipsimple.R;
import com.csipsimple.api.SipProfile;
import com.csipsimple.db.DBAdapter;
import com.csipsimple.models.Filter;
import com.csipsimple.utils.Log;
import com.csipsimple.utils.contacts.ContactsAutocompleteAdapter;
import com.csipsimple.utils.contacts.ContactsWrapper;
import com.csipsimple.utils.contacts.ContactsWrapper.OnPhoneNumberSelected;
import com.csipsimple.widgets.AccountChooserButton.OnAccountChangeListener;

public class EditSipUri extends LinearLayout implements TextWatcher, OnItemClickListener {

	protected static final String THIS_FILE = "EditSipUri";
	private AutoCompleteTextView dialUser;
	private AccountChooserButton accountChooserButtonText;
	private TextView domainTextHelper;
	private ListView completeList;
	private SimpleCursorAdapter contactsAdapter;
	private ContactsAutocompleteAdapter autoCompleteAdapter;
	
	
	public EditSipUri(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater inflater = LayoutInflater.from(context);
		inflater.inflate(R.layout.edit_sip_uri, this, true);
		
		dialUser = (AutoCompleteTextView) findViewById(R.id.dialtxt_user);
		accountChooserButtonText = (AccountChooserButton) findViewById(R.id.accountChooserButtonText);
		domainTextHelper = (TextView) findViewById(R.id.dialtxt_domain_helper);
		completeList = (ListView) findViewById(R.id.autoCompleteList);
		
		autoCompleteAdapter = new ContactsAutocompleteAdapter(context);
		
		//Map events
		accountChooserButtonText.setOnAccountChangeListener(new OnAccountChangeListener() {
			@Override
			public void onChooseAccount(SipProfile account) {
				updateDialTextHelper();
				long accId = SipProfile.INVALID_ID;
				if(account != null) {
					accId = account.id;
				}
				autoCompleteAdapter.setSelectedAccount(accId);
			}
		});
		dialUser.addTextChangedListener(this);
		
		contactsAdapter =  ContactsWrapper.getInstance().getAllContactsAdapter((Activity)context, android.R.layout.two_line_list_item, new int[] {android.R.id.text1 });
		completeList.setAdapter(contactsAdapter);
		completeList.setOnItemClickListener(this);
		
		dialUser.setAdapter(autoCompleteAdapter);
		
	}
	
	public class ToCall {
		private Long accountId;
		private String callee;
		public ToCall(Long acc, String uri) {
			accountId = acc;
			callee = uri;
		}
		
		/**
		 * @return the pjsipAccountId
		 */
		public Long getAccountId() {
			return accountId;
		}
		/**
		 * @return the callee
		 */
		public String getCallee() {
			return callee;
		}
	};
	

	private void updateDialTextHelper() {

		String dialUserValue = dialUser.getText().toString();

		accountChooserButtonText.setChangeable(TextUtils.isEmpty(dialUserValue));
		
		SipProfile acc = accountChooserButtonText.getSelectedAccount();
		if(!Pattern.matches(".*@.*", dialUserValue) && acc != null && acc.id > SipProfile.INVALID_ID) {
			domainTextHelper.setText("@"+acc.getDefaultDomain());
		}else {
			domainTextHelper.setText("");
		}
		
	}
	
	public ToCall getValue() {
		String userName = dialUser.getText().toString();
		String toCall = ""; 
		Long accountToUse = null;
		if (TextUtils.isEmpty(userName)) {
			return null;
		}
		userName = userName.replaceAll("[ \t]", "");
		SipProfile acc = accountChooserButtonText.getSelectedAccount();
		if (acc != null) {
			accountToUse = acc.id;
			// If this is a sip account
			if(accountToUse > SipProfile.INVALID_ID) {
				if(Pattern.matches(".*@.*", userName)) {
					toCall = "sip:" + userName +"";
				}else {
					toCall = "sip:" + userName + "@" + acc.getDefaultDomain();
				}
			}else {
				toCall = userName;
			}
		}else {
			toCall = userName;
		}
		
		return new ToCall(accountToUse, toCall);
	}
	
	public SipProfile getSelectedAccount() {
		return accountChooserButtonText.getSelectedAccount();
	}
	
	
	@Override
	public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) { }

	@Override
	public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
		updateDialTextHelper();
	}
	
	@Override
	public void afterTextChanged(Editable s) {
		updateDialTextHelper();
	}

	public void clear() {
		dialUser.getText().clear();
	}

	public void setTextValue(String number) {
		clear();
		dialUser.getText().append(number);
	}

	public EditText getTextField() {
		return dialUser;
	}
	
	public void setListVisibility(int visibility) {
		completeList.setVisibility(visibility);
	}

	@Override
	public void onItemClick(AdapterView<?> ad, View view, int position, long arg3) {
		Long contactId = (Long) view.getTag();
		ContactsWrapper.getInstance().treatContactPickerPositiveResult(getContext(), contactId.toString(), new OnPhoneNumberSelected() {
			@Override
			public void onTrigger(String number) {
				SipProfile account = accountChooserButtonText.getSelectedAccount();
				DBAdapter db = new DBAdapter(getContext());
				String rewritten = Filter.rewritePhoneNumber(account, number.toString(), db);
				setTextValue(rewritten);
			}
		});
		Log.d(THIS_FILE, "Clicked contact "+contactId);
	}

	public void setShowExternals(boolean b) {
		accountChooserButtonText.setShowExternals(b);
	}
}
