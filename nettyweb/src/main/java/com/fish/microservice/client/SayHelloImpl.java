package com.fish.microservice.client;

import fish.api.SayHello;

/**
 * SayHello 实现类
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2020/1/4 17:08
 */
public class SayHelloImpl implements SayHello {
    @Override
    public String say() {
        return "Hello Fish";
    }
}
