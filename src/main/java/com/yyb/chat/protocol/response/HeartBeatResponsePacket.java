package com.yyb.chat.protocol.response;


import com.yyb.chat.protocol.Packet;

import static com.yyb.chat.protocol.command.Command.HEARTBEAT_RESPONSE;

public class HeartBeatResponsePacket extends Packet {
    @Override
    public Byte getCommand() {
        return HEARTBEAT_RESPONSE;
    }
}
