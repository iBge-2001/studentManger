package com.lin.service.impl;

import com.lin.dao.StudentDao;
import com.lin.domain.Academy;
import com.lin.domain.Student;
import com.lin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public Boolean save(Student student) {
        return studentDao.save(student)>0;
    }

    @Override
    public Boolean update(Student student) {
        return studentDao.update(student)>0;
    }

    @Override
    public Boolean delete(long id) {
        return studentDao.delete(id)>0;
    }

    @Override
    public Student getById(long id) {
        return studentDao.getById(id);
    }

    @Override
    public List<Student> getAll() {
        return studentDao.getAll();
    }
    public List<Student> getFuzzy(Object object){
        return studentDao.getFuzzy("%"+object+"%");
    }
}
