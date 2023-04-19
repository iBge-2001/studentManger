package com.lin.dao;


import com.lin.domain.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from account where user = #{user}")
    public User selectOneUser(String user);
}
