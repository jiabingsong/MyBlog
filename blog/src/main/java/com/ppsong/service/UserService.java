package com.ppsong.service;

import com.ppsong.domain.User;

import java.util.List;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 13:18 2020/6/18
 * @Modified By:
 */
public interface UserService {
    //通过id查询
    public User getUserById(Integer id);
    //获取用户列表
    public List<User> getUserList();
    //增
    public int add(User user);
    //删
    public int delete(Integer id);
    //改
    public int update(Integer id,User user);
}
