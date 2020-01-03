package com.fish.microservice.server;

import com.fish.microservice.server.handler.ServerHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * Server的Main方法
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/12/24 21:47
 */
public class ServerMain {
    public static void main(String[] args) {
        NioEventLoopGroup w = new NioEventLoopGroup();
        NioEventLoopGroup r = new NioEventLoopGroup();

        ServerBootstrap bootstrap = new ServerBootstrap ();
        bootstrap.group(w,r).channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new ServerHandler());
                    }
                }).bind(3333);
    }
}
