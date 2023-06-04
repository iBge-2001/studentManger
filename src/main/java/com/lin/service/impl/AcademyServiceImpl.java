package com.lin.service.impl;

import com.lin.dao.AcademyDao;
import com.lin.dao.StudentDao;
import com.lin.domain.Academy;
import com.lin.domain.ClassDetail;
import com.lin.domain.Student;
import com.lin.service.AcademyService;
import com.lin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademyServiceImpl implements AcademyService {
    @Autowired
    private AcademyDao academyDao;
    @Override
    public List<Academy> getProfession() {
        return academyDao.getProfession();
    }
    @Override
    public List<Student> getByProfessionId(String st_profession) {
        return academyDao.getByProfessionId(st_profession);
    }

    @Override
    public Integer getAcademyCount() {
        return academyDao.getAcademyCount();
    }

    @Override
    public List<String> getClassName(String profession_name) {
        return academyDao.getClassName(profession_name);
    }
    @Override
    public List<Student> getByS_Id(String student_id) {
        return academyDao.getByS_id(student_id);
    }

    @Override
    public Boolean updateClass(ClassDetail classDetail) {
        return academyDao.updateClass(classDetail)>0;
    }
}
