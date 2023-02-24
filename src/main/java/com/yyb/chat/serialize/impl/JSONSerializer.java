package com.yyb.chat.serialize.impl;

import com.alibaba.fastjson.JSON;
import com.yyb.chat.serialize.Serializer;
import com.yyb.chat.serialize.SerializerAlgorithm;

/**
 * @author yyb
 * @date 2022-12-3 下午3:25
 */
public class JSONSerializer implements Serializer {
    @Override
    public byte getSerializerAlgorithm() {
        return SerializerAlgorithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {

        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {

        return JSON.parseObject(bytes, clazz);
    }
}
