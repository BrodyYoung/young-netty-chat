package com.yyb.chat.protocol.response;

import com.yyb.chat.protocol.Packet;
import lombok.Data;


import static com.yyb.chat.protocol.command.Command.LOGIN_RESPONSE;

@Data
public class LoginResponsePacket extends Packet {
    private String userId;

    private String userName;

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return LOGIN_RESPONSE;
    }
}
