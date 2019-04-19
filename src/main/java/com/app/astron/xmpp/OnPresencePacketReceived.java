package com.app.astron.xmpp;

import com.app.astron.entities.Account;
import com.app.astron.xmpp.stanzas.PresencePacket;

public interface OnPresencePacketReceived extends PacketReceived {
	public void onPresencePacketReceived(Account account, PresencePacket packet);
}
