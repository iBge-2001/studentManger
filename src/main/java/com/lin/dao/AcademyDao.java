package com.lin.dao;

import com.lin.domain.Academy;
import com.lin.domain.ClassDetail;
import com.lin.domain.Student;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AcademyDao {
    //获取学院的专业有哪些
    @Select("select DISTINCT profession_name,profession_id from academy")
    public List<Academy> getProfession();
    //根据专业获取该专业学生信息
    @Select("select *from detailview where st_profession = #{st_profession}")
    public List<Student> getByProfessionId(String st_profession);
    @Select("SELECT SUM(count.count),count.academy FROM count GROUP BY count.academy")
    public Integer getAcademyCount();
    //查询单个学生的信息
    @Select("select * from detailview where st_id = #{student_id}")
    List<Student> getByS_id(String student_id);
    //获取所有班级
    @Select("select classname from academy where profession_name = #{profession_name}")
    public List<String> getClassName(String profession_name);
    //修改班级信息
    @Update("update academy set profession_id=#{profession_id},academy=#{academy},instructor=#{instructor},classname=#{classname} where classname = #{classname}")
    public int updateClass(ClassDetail classDetail);
}
