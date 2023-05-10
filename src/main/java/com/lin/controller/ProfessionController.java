package com.lin.controller;

import com.lin.domain.Academy;
import com.lin.domain.Student;
import com.lin.service.AcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profession")
public class ProfessionController {
    @Autowired
    private AcademyService academyService;
    @GetMapping()
    public Result getProfession() {
        List<Academy> profession = academyService.getProfession();
        Integer code = profession !=null ? Code.GET_OK:Code.GET_ERR;
        String msg = profession!=null ? "查询成功" :"查询失败";
        System.out.println(profession!=null ? "查询成功" :"查询失败");
        return new Result(code,profession,msg);
    }
    @GetMapping("/{professionName}")
    public Result getByProId(@PathVariable String professionName) {

        List<Student> studentList =  academyService.getByProfessionId(professionName);
        Integer code = studentList!=null ? Code.GET_OK:Code.GET_ERR;
        String msg = studentList!=null ? "查询成功" :"查询失败";
        return new Result(code,studentList,msg);
    }
    @GetMapping("/count")
    public Result getCount(){
        Integer count = academyService.getAcademyCount();
        Integer code = count != null ? Code.GET_OK:Code.GET_ERR;
        String msg = count !=null ?"查询成功" :"查询失败";
        System.out.println(count !=null ? "查询成功" :"查询失败");
        return new Result(code,count,msg);
    }

    @GetMapping("/OneStudent/{student_id}")
    public Result getByS_Id(@PathVariable String student_id) {
        List<Student> studentList =  academyService.getByS_Id(student_id);
        Integer code = studentList!=null ? Code.GET_OK:Code.GET_ERR;
        String msg = studentList!=null ? "查询成功" :"查询失败";
        return new Result(code,studentList,msg);
    }
}
