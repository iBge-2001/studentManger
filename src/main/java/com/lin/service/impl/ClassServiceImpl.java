package com.lin.service.impl;

import com.lin.dao.ClassDao;
import com.lin.domain.ClassDetail;
import com.lin.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service


public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassDao classDao;

    @Override
    public List<String> getByAcademyName() {
        return classDao.getByAcademyName();
    }
    public List<ClassDetail> getAll(String academy){
        return classDao.getAll( academy);
    }

    @Override
    public ClassDetail getByclass(String classname) {
        return classDao.getByclass(classname);
    }

    @Override
    public String getAvgCount() {
        return classDao.getAvgCount();
    }

    @Override
    public String getClassCount() {
        return classDao.getClassCount();
    }
}
