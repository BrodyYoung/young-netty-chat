package com.yyb.chat.protocol.response;

import com.yyb.chat.protocol.Packet;
import com.yyb.chat.session.Session;
import lombok.Data;

import java.util.List;

import static com.yyb.chat.protocol.command.Command.LIST_GROUP_MEMBERS_RESPONSE;


@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    private List<Session> sessionList;

    @Override
    public Byte getCommand() {

        return LIST_GROUP_MEMBERS_RESPONSE;
    }
}
