package com.yyb.chat.protocol.request;


import com.yyb.chat.protocol.Packet;

import static com.yyb.chat.protocol.command.Command.HEARTBEAT_REQUEST;

public class HeartBeatRequestPacket extends Packet {
    @Override
    public Byte getCommand() {
        return HEARTBEAT_REQUEST;
    }
}
