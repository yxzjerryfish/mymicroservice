package com.fish.microservice.client;

import com.fish.microservice.client.handler.ClientHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;

/**
 * Client的Main方法
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/12/24 21:47
 */
@Slf4j
public class ClientMain {
    public static void main(String[] args) {
        NioEventLoopGroup w = new NioEventLoopGroup();

        Bootstrap bootstrap = new Bootstrap();

        bootstrap.group(w)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new ClientHandler());
                    }
                }).bind(3333);

        bootstrap.connect("localhost",3333).addListener(future->{
            if(future.isSuccess()){
                log.info("连接成功");
            } else {
                log.info("连接失败");
            }
        });
    }
}
