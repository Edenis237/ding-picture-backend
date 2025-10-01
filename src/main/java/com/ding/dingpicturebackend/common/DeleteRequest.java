package com.ding.dingpicturebackend.common;

import lombok.Data;

import java.io.Serializable;
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    // 序列化版本号
    private static final long serialVersionUID = 1L;
}
