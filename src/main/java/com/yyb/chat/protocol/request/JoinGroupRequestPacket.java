package com.yyb.chat.protocol.request;

import com.yyb.chat.protocol.Packet;
import lombok.Data;

import static com.yyb.chat.protocol.command.Command.JOIN_GROUP_REQUEST;


@Data
public class JoinGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_REQUEST;
    }
}
