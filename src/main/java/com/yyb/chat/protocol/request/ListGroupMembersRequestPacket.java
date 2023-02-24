package com.yyb.chat.protocol.request;

import com.yyb.chat.protocol.Packet;
import lombok.Data;

import static com.yyb.chat.protocol.command.Command.LIST_GROUP_MEMBERS_REQUEST;


@Data
public class ListGroupMembersRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return LIST_GROUP_MEMBERS_REQUEST;
    }
}
