package com.yyb.chat.serialize;

import com.yyb.chat.serialize.impl.JSONSerializer;

/**
 * @author yyb
 * @date 2022-12-3 下午3:24
 */
public interface Serializer {
    Serializer DEFAULT = new JSONSerializer();

    /**
     * 序列化算法
     * @return
     */
    byte getSerializerAlgorithm();

    /**
     * java 对象转换成二进制
     */
    byte[] serialize(Object object);

    /**
     * 二进制转换成 java 对象
     */
    <T> T deserialize(Class<T> clazz, byte[] bytes);
}
