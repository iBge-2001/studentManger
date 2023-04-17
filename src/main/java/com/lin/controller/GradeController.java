package com.lin.controller;

import com.lin.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Grade")
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @GetMapping("/Course/{st_profession}")
    public Result getCourse(@PathVariable String st_profession){
         List<String> course= gradeService.GetCourse(st_profession);
        Integer code = course !=null ? Code.GET_OK:Code.GET_ERR;
        String msg = course!=null ? "查询成功" :"查询失败";
        System.out.println(course!=null ? "查询成功" :"查询失败");
        return new Result(code,course,msg);
    }


}
