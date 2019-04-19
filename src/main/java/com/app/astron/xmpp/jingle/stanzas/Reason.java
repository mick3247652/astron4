package com.app.astron.xmpp.jingle.stanzas;

import com.app.astron.xml.Element;

public class Reason extends Element {
	private Reason(String name) {
		super(name);
	}

	public Reason() {
		super("reason");
	}
}
