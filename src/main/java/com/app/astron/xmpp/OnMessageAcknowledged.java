package com.app.astron.xmpp;

import com.app.astron.entities.Account;

public interface OnMessageAcknowledged {
	boolean onMessageAcknowledged(Account account, String id);
}
