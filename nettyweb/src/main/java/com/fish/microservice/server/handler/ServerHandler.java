package com.fish.microservice.server.handler;

import com.fish.microservice.util.JsonSerializerUtil;
import fish.api.SayHello;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

/**
 * 服务端Handler
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2020/1/3 20:41
 */
@Slf4j
public class ServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        log.info("***************************************");
        ByteBuf byteBuf = (ByteBuf) msg;
        int length = byteBuf.readInt();

        byte[] bytes = new byte[length];
        byteBuf.readBytes(bytes);
        log.info(JsonSerializerUtil.deserialize(SayHello.class,bytes).say());
    }
}
