package com.lin.dao;

import com.lin.controller.GradeController;
import com.lin.domain.Course;
import com.lin.domain.Grade;
import org.apache.ibatis.annotations.*;

import java.util.Collection;
import java.util.List;

public interface GradeDao {
    GradeController gradeController = new GradeController();
    Collection col = gradeController.course;
    @Select("select * from gradebyprofession where st_profession = '${st_profession}'")
    @Results({
            @Result(id = true, property = "st_id",column = "st_id"),
            @Result(property = "st_name",column = "st_name"),
            @Result(property = "st_profession",column = "st_profession"),
            @Result(property = "总分",column = "总分"),
            @Result(property = "平均分",column = "平均分"),
            @Result(property = "listCourse",column = "st_id",
                    javaType = List.class,
                    many = @Many(select = "com.lin.dao.GradeDao.GetDistinctCourse"))
    })
    public List<Grade> GetAll(String st_profession);

    @Select("select *  from grade where st_id = ${st_id}")
    public List<Course> GetDistinctCourse(long st_id);
    @Update("update grade set grade = #{list.grade} where st_id = #{list.st_id} and course = #{list.course}")
    public int updateGrade(List<Grade> list);
    @Select("select course from course where st_profession = #{st_profession}")
    public List<String> GetCourse(String st_profession);
    @Select("SELECT COUNT( gradelist.st_id ) as count,gradelist.st_profession,gradelist.course \n" +
            "FROM gradelist WHERE gradelist.grade < 60  AND gradelist.st_profession = #{st_profession} GROUP BY gradelist.course ORDER BY gradelist.course ASC")
    public List<Grade> GetCount(String st_profession);
}
