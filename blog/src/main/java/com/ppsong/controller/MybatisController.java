package com.ppsong.controller;

import com.ppsong.domain.User;
import com.ppsong.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 21:41 2020/2/5
 * @Modified By:
 */
//@Controller
//public class MybatisController {
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @RequestMapping("/query")
//    @ResponseBody
//    public List<User> queryUserList() {
//        List<User> users = userMapper.queryUserList();
//        return users;
//    }
//}
