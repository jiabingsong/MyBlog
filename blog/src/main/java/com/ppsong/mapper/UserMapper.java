package com.ppsong.mapper;

import com.ppsong.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 21:19 2020/2/5
 * @Modified By:
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE id = #{id}")
    public User getUserById(Integer id);
    //查全部
    @Select("SELECT * FROM user")
    public List<User> getUserList();
    //增
    @Insert("insert into user(id,username,password,name) values(#{id},#{username},#{password},#{name})")
    public int add(User user);
    //删
    @Delete("delete from user where id=#{id}")
    public int delete(Integer id);
    //改
    @Update("update user set username=#{user.username},password=#{user.password},name=#{user.name} where id=#{id}")
    public int update(@Param("id") Integer id,@Param("user") User user);
}
