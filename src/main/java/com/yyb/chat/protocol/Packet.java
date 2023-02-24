package com.yyb.chat.protocol;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author yyb
 * @date 2022-12-3 下午3:31
 */
@Data
public abstract class Packet {
    /**
     * 协议版本
     */
    @JSONField(deserialize = false, serialize = false)
    private Byte version = 1;


    @JSONField(serialize = false)
    public abstract Byte getCommand();
}
