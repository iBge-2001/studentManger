package com.lin.service;

import com.lin.domain.Academy;
import com.lin.domain.ClassDetail;

import java.util.List;

public interface ClassService {
    public List<String> getByAcademyName();
    public List<ClassDetail> getAll(String academy);
    public ClassDetail getByclass(String classname);
    public String getAvgCount();
    public String getClassCount();
}
