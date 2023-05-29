package com.lin.dao;


import com.lin.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {
    @Select("select * from account where user = #{user}")
    public User selectOneUser(String user);
    @Select("select *from account")
    public List<User> getAll();
    @Insert("INSERT INTO account(user,password,id,type) VALUES(#{user},#{password},#{id},#{type})")
    public int saveUser(User user);
    @Delete("delete from account where user = #{user}")
    public int Delete(int user);
    @Update("update account set password =#{password}  where id = #{id}")
    public int updatePwd(User user);

}
