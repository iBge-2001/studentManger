package com.lin;


import com.lin.config.SpringConfig;
import com.lin.dao.GradeDao;
import com.lin.domain.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestGardeDao {
    @Autowired
    private GradeDao gradeDao;

    @Test
    public void testSelectGradesById(){
        long id = Long.parseLong("20034480401");
        List<Course> courses = gradeDao.GetDistinctCourse(id);
        System.out.println(courses);
    }
}
