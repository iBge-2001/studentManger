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
    @Select("SELECT dormitory.*, student.st_name, student.st_class FROM student INNER JOIN dormitory ON  student.st_id = dormitory.st_id")
    public List<Dormitory> getDormitory();
    @Delete("delete from dormitory where st_id = #{st_id}")
    public int delete(Integer id);
    @Select("SELECT dormitory.*, student.st_name, student.st_class FROM student INNER JOIN dormitory ON  student.st_id = dormitory.st_id where student.st_id = #{st_id}")
    public Dormitory selectById(long id);
    @Update("update dormitory set  dormitory_no = #{dormitory_no}, building_no = #{building_no} where st_id = #{st_id}")
    public int update(Dormitory dormitory);
    @Select("SELECT dormitory.*, student.st_name, student.st_class FROM student INNER JOIN dormitory ON  student.st_id = dormitory.st_id where dormitory.st_id like #{object}  or student.st_name like #{object} or student.st_class like #{object} or dormitory.building_no like #{object}  or dormitory.dormitory_no like #{object} ")
    public List<Dormitory> getFuzzy(Object object);

}
