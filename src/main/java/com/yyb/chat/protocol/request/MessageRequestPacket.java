package com.yyb.chat.protocol.request;

import com.yyb.chat.protocol.Packet;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.yyb.chat.protocol.command.Command.MESSAGE_REQUEST;


@Data
@NoArgsConstructor
public class MessageRequestPacket extends Packet {
    private String toUserId;
    private String message;

    public MessageRequestPacket(String toUserId, String message) {
        this.toUserId = toUserId;
        this.message = message;
    }

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
