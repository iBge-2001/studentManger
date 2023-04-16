package com.lin.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GradeDao {
    @Select("select course from coursebyprofession where st_profession =#{st_profession}")
    public List<String> GetCourse(String st_profession);


}
