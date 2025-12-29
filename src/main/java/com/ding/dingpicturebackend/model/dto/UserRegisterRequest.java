package com.ding.dingpicturebackend.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 873565015179439661L;

    /***
     * 账号
     */
    private String userAccount;

    /***
     * 密码
     */
    private String userPassword;

    /***
     * 确认密码
     */
    private String checkPassword;
}
