package com.yyb.chat.protocol.response;

import com.yyb.chat.protocol.Packet;
import com.yyb.chat.session.Session;
import lombok.Data;

import static com.yyb.chat.protocol.command.Command.GROUP_MESSAGE_RESPONSE;


@Data
public class GroupMessageResponsePacket extends Packet {

    private String fromGroupId;

    private Session fromUser;

    private String message;

    @Override
    public Byte getCommand() {

        return GROUP_MESSAGE_RESPONSE;
    }
}
