package com.yyb.chat.protocol.request;

import com.yyb.chat.protocol.Packet;
import lombok.Data;

import static com.yyb.chat.protocol.command.Command.QUIT_GROUP_REQUEST;

@Data
public class QuitGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return QUIT_GROUP_REQUEST;
    }
}
