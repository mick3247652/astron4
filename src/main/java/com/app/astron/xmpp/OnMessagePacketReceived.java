package com.app.astron.xmpp;

import com.app.astron.entities.Account;
import com.app.astron.xmpp.stanzas.MessagePacket;

public interface OnMessagePacketReceived extends PacketReceived {
	public void onMessagePacketReceived(Account account, MessagePacket packet);
}
