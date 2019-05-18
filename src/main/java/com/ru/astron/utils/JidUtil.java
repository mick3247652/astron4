package com.ru.astron.utils;

import rocks.xmpp.addr.Jid;

public class JidUtil {
    public static Jid createJid(String st){
        return Jid.of(st);
    }
    public static Jid of(String st){
        return Jid.of(st);
    }

    public static Jid of(CharSequence local, CharSequence domain, CharSequence resource){
        return Jid.of(local,domain,resource);
    }
}
