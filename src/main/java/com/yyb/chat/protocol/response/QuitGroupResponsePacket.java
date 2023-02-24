package com.yyb.chat.protocol.response;

import com.yyb.chat.protocol.Packet;
import lombok.Data;

import static com.yyb.chat.protocol.command.Command.QUIT_GROUP_RESPONSE;


@Data
public class QuitGroupResponsePacket extends Packet {

    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {

        return QUIT_GROUP_RESPONSE;
    }
}
