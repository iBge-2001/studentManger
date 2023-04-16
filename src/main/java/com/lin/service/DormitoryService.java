package com.lin.service;

import com.lin.domain.Academy;
import com.lin.domain.Dormitory;
import com.lin.domain.Student;

import java.util.List;

public interface DormitoryService {
    public List<Dormitory> getDormitory();
    public Boolean delete(Integer id);
    public Boolean update(Dormitory dormitory);
    public Dormitory selectById(long id);
}
