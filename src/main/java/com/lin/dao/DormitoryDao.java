package com.lin.dao;

import com.lin.domain.Academy;
import com.lin.domain.Dormitory;
import com.lin.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
//private String st_name;
//    private int buliding_no;
//    private int dormitory_no;
//    private String st_class;
public interface DormitoryDao {
    @Select("select *from dormitory")
    public List<Dormitory> getDormitory();
    @Delete("delete from dormitory where st_id = #{st_id}")
    public int delete(Integer id);
    @Select("select *from dormitory where st_id = #{st_id}")
    public Dormitory selectById(long id);
    @Update("update dormitory set st_name = #{st_name}, dormitory_no = #{dormitory_no}, buliding_no = #{buliding_no} where st_id = #{st_id}")
    public int update(Dormitory dormitory);
}
