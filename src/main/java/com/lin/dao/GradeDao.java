package com.lin.dao;

import com.lin.controller.GradeController;
import com.lin.domain.Course;
import com.lin.domain.Grade;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;

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

    //根据学生id查询其成绩
    @Select("select *  from grade where st_id = ${st_id}")
    public List<Course> GetDistinctCourse(long st_id);

    @Update("<script><foreach collection = 'list' item ='item' open='' close='' separator=';'> update grade set grade = #{item.grade} where st_id = #{item.st_id} and course = #{item.course}</foreach></script>")
    public int updateGrade(@Param("list") List<Course> list);
    @Select("select course from course where st_profession = #{st_profession}")
    public List<String> GetCourse(String st_profession);
    @Select("SELECT COUNT( gradelist.st_id ) as count,gradelist.st_profession,gradelist.course \n" +
            "FROM gradelist WHERE gradelist.grade < 60  AND gradelist.st_profession = #{st_profession} GROUP BY gradelist.course ORDER BY gradelist.course ASC")
    public List<Grade> GetCount(String st_profession);
    @Insert("<script><foreach collection = 'list' item ='item' open='' close='' separator=';'> insert into grade (grade,st_id,course) values (#{item.grade},#{list[0].st_id},#{item.course}) </foreach></script>")
    public int insGrade(@Param("list") List<Course> list);
    @Select("SELECT CONCAT(ROUND((SELECT COUNT(grade.st_id) FROM grade WHERE grade.grade < 60)/ (SELECT COUNT(grade.st_id) FROM grade)*100,2),'%') As 百分比;")
    public String getPercent();
    @Delete("Delete  from grade where st_id = #{st_id}")
    public int deleteGrade(long st_id);
    @Select("select st_id,grade,st_profession,st_name from gradelist where course = '${course}' and st_profession = '${st_profession}' and grade < 60")
    public List<Grade> getFail(Grade grade);
}
