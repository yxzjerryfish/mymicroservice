package com.fish.microservice.util;

import com.alibaba.fastjson.JSON;

/**
 * JSON序列化和反序列化
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2020/1/4 16:59
 */
public class JsonSerializerUtil {

    private JsonSerializerUtil(){}

    public static byte[] serialize(Object object) {

        return JSON.toJSONBytes(object);
    }

    public static <T>  T deserialize(Class<T> clazz, byte[] bytes) {

        return JSON.parseObject(bytes, clazz);
    }
}
