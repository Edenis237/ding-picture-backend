package com.ding.dingpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ding.dingpicturebackend.model.dto.UserQueryRequest;
import com.ding.dingpicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ding.dingpicturebackend.model.vo.LoginUserVO;
import com.ding.dingpicturebackend.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author Narwhal
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-10-15 20:55:24
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 获取加密密码
     */
    String getEncryptPassword(String userAccount);

    /**
     * 用户登录
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户注销
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取脱敏后的用户信息
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获取当前登录用户
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 获取脱敏后的用户信息
     */
    UserVO getUserVO(User user);

    /**
     * 获取脱敏后的用户列表
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 获取查询条件
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);
}
