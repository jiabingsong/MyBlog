package com.ppsong.service.lmpl;

import com.ppsong.domain.User;
import com.ppsong.mapper.UserMapper;
import com.ppsong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 13:21 2020/6/18
 * @Modified By:
 */
@Service
public class UserServicelmpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int delete(Integer id) {
        return userMapper.delete(id);
    }

    @Override
    public int update(Integer id, User user) {
        return userMapper.update(id,user);
    }
}
