package com.app.astron.xmpp.jingle;

import com.app.astron.entities.Account;
import com.app.astron.xmpp.PacketReceived;
import com.app.astron.xmpp.jingle.stanzas.JinglePacket;

public interface OnJinglePacketReceived extends PacketReceived {
	void onJinglePacketReceived(Account account, JinglePacket packet);
}
