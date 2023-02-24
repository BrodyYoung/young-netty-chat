package com.yyb.chat.protocol.response;

import com.yyb.chat.protocol.Packet;
import lombok.Data;

import static com.yyb.chat.protocol.command.Command.MESSAGE_RESPONSE;

@Data
public class MessageResponsePacket extends Packet {

    private String fromUserId;

    private String fromUserName;

    private String message;

    @Override
    public Byte getCommand() {

        return MESSAGE_RESPONSE;
    }
}
