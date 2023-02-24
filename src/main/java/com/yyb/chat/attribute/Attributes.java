package com.yyb.chat.attribute;

import com.yyb.chat.session.Session;
import io.netty.util.AttributeKey;


public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
