package com.lin.dao;

import com.lin.domain.Grade;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GradeDao {
    @Select("select * from gradebyprofession where st_profession =#{st_profession}")
    public List<Grade> GetAll(String st_profession);
    @Select("select course from course where st_profession = #{st_profession}")
    public List<String> GetCourse(String st_profession);
}
