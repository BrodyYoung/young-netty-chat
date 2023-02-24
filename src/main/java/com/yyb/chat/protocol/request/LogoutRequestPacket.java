package com.yyb.chat.protocol.request;

import com.yyb.chat.protocol.Packet;
import lombok.Data;

import static com.yyb.chat.protocol.command.Command.LOGOUT_REQUEST;


@Data
public class LogoutRequestPacket extends Packet {
    @Override
    public Byte getCommand() {

        return LOGOUT_REQUEST;
    }
}
