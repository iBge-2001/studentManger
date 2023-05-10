package com.lin.service;

import com.lin.domain.Academy;
import com.lin.domain.Student;

import java.util.List;

public interface AcademyService {
    public List<Academy> getProfession();
    public List<Student> getByProfessionId(String profession_name);
    public Integer getAcademyCount();

    List<Student> getByS_Id(String student_id);
}
