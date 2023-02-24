package com.yyb.chat.protocol.response;

import com.yyb.chat.protocol.Packet;
import lombok.Data;

import static com.yyb.chat.protocol.command.Command.JOIN_GROUP_RESPONSE;

@Data
public class JoinGroupResponsePacket extends Packet {
    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_RESPONSE;
    }
}
