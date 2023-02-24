package com.yyb.chat.protocol.request;

import com.yyb.chat.protocol.Packet;
import lombok.Data;


import java.util.List;

import static com.yyb.chat.protocol.command.Command.CREATE_GROUP_REQUEST;


@Data
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_REQUEST;
    }
}
