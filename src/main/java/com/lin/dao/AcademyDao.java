package com.lin.dao;

import com.lin.domain.Academy;
import com.lin.domain.Student;
import org.apache.ibatis.annotations.Select;

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
}
