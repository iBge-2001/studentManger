package com.lin.dao;


import com.lin.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from account where user = #{user}")
    public User selectOneUser(String user);
    @Select("select *from account")
    public List<User> getAll();
}
