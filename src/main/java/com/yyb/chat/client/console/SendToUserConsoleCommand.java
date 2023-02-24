package com.yyb.chat.client.console;

import com.yyb.chat.protocol.request.MessageRequestPacket;
import io.netty.channel.Channel;


import java.util.Scanner;

public class SendToUserConsoleCommand implements ConsoleCommand {
    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.print("发送消息给某个用户：");

        String toUserId = scanner.next();
        String message = scanner.next();
        channel.writeAndFlush(new MessageRequestPacket(toUserId, message));
    }
}
