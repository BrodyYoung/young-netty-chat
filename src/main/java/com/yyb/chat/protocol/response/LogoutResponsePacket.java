package com.yyb.chat.protocol.response;

import com.yyb.chat.protocol.Packet;
import lombok.Data;

import static com.yyb.chat.protocol.command.Command.LOGOUT_RESPONSE;


@Data
public class LogoutResponsePacket extends Packet {

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return LOGOUT_RESPONSE;
    }
}
