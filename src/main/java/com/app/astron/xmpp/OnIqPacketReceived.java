package com.app.astron.xmpp;

import com.app.astron.entities.Account;
import com.app.astron.xmpp.stanzas.IqPacket;

public interface OnIqPacketReceived extends PacketReceived {
	void onIqPacketReceived(Account account, IqPacket packet);
}
