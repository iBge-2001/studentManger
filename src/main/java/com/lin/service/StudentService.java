package com.lin.service;

import com.lin.domain.Academy;
import com.lin.domain.Student;



import java.util.List;
import java.util.Map;

public interface StudentService {
    public Boolean save(Student student);
    public Boolean update(Student student);
    public Boolean delete(long id);
    public Student getById(long id);
    public List<Student> getAll();
    public List<Student> getFuzzy(Object object);
}
