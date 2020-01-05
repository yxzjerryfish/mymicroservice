package com.fish.microservice.client.handler;

import com.fish.microservice.client.SayHelloImpl;
import com.fish.microservice.util.JsonSerializerUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

/**
 * 客户端Handler
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2020/1/3 20:38
 */
@Slf4j
public class ClientHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info(LocalDateTime.now() + ": 客户端开始登录");;
        ByteBuf buf =  ctx.alloc().ioBuffer();
        byte[] bytes = JsonSerializerUtil.serialize(new SayHelloImpl());
        buf.writeBytes(bytes);
        ctx.channel().writeAndFlush(buf);
    }
}
