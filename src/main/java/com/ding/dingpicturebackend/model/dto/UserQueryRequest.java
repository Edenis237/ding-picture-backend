package com.ding.dingpicturebackend.model.dto;

import com.ding.dingpicturebackend.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
@EqualsAndHashCode(callSuper = true) // 继承父类属性
@Data
public class UserQueryRequest extends PageRequest implements Serializable {

    /**
     * id
     */
    private Long id;
    /**
     * 用户昵称
     */
    private String userName;
    /**
     * 用户账号
     */
    private String userAccount;
    /**
     * 用户头像
     */
    private String userProfile;
    /**
     * 用户角色：user/admin
     */
    private String userRole;
    private static final long serialVersionUID = 1L;
}
