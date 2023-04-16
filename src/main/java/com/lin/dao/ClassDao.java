package com.lin.dao;

import com.lin.domain.Academy;
import com.lin.domain.ClassDetail;
import com.lin.domain.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ClassDao {
    @Select("select DISTINCT academy from academy ")
    public List<String> getByAcademyName();
    @Select("select  * from count where academy = #{academy}")
    public List<ClassDetail> getAll(String academy);
    @Select("select *from count where classname = #{classname}")
    public ClassDetail getByclass(String classname);
}
