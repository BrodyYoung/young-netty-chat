package com.yyb.chat.protocol.request;

import com.yyb.chat.protocol.Packet;
import lombok.Data;

import static com.yyb.chat.protocol.command.Command.LOGIN_REQUEST;


@Data
public class LoginRequestPacket extends Packet {
    private String userName;

    private String password;

    @Override
    public Byte getCommand() {

        return LOGIN_REQUEST;
    }
}
