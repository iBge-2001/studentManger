package com.lin.service.impl;

import com.lin.dao.GradeDao;
import com.lin.domain.Course;
import com.lin.domain.Grade;
import com.lin.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeDao gradeDao;

    @Override
    public List<Grade> GetAll(String st_profession) {
        return gradeDao.GetAll(st_profession);
    }

    @Override
    public List<String> GetCourse(String st_profession) {
        return gradeDao.GetCourse(st_profession);
    }

    @Override
    public List<Course> GetDistinctCourse(long st_id) {
        return gradeDao.GetDistinctCourse(st_id);
    }

    @Override
    public List<Grade> GetCount(String st_profession) {
        return gradeDao.GetCount(st_profession);
    }

    @Override
    public Boolean updateGrade(List<Course> list) {
     int i = gradeDao.updateGrade(list);
     return i>0;
    }

    @Override
    public Boolean insGrade(List<Course> list) {
        return gradeDao.insGrade(list)>0;
    }

    @Override
    public String getPercent() {
        return gradeDao.getPercent();
    }

    @Override
    public Boolean deleteGrade(long st_id) {
        return gradeDao.deleteGrade(st_id)>0;
    }

    @Override
    public List<Grade> getFail(Grade grade) {
        return gradeDao.getFail(grade);
    }
}
