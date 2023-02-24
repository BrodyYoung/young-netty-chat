package com.yyb.chat.protocol.response;

import com.yyb.chat.protocol.Packet;
import lombok.Data;

import java.util.List;

import static com.yyb.chat.protocol.command.Command.CREATE_GROUP_RESPONSE;


@Data
public class CreateGroupResponsePacket extends Packet {
    private boolean success;

    private String groupId;

    private List<String> userNameList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_RESPONSE;
    }
}
