package com.lin.service;

import com.lin.domain.Course;
import com.lin.domain.Grade;

import java.util.List;

public interface GradeService {
    public List<Grade> GetAll(String st_profession);
    public List<String> GetCourse(String st_profession);
    public List<Course> GetDistinctCourse(long st_id);
    public List<Grade> GetCount(String st_profession);
    public Boolean updateGrade(List<Grade> list);
}
