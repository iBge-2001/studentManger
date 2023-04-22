package com.lin.controller;

import com.lin.domain.Course;
import com.lin.domain.Grade;
import com.lin.domain.Student;
import com.lin.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/Grade")
public class GradeController {
    @Autowired
    private GradeService gradeService;
    public static List<String> course = null;
    @GetMapping("/Course/{st_profession}")
    public Result getCourse(@PathVariable String st_profession){
         course= gradeService.GetCourse(st_profession);
        Integer code = course !=null ? Code.GET_OK:Code.GET_ERR;
        String msg = course!=null ? "查询成功" :"查询失败";
        System.out.println(course!=null ? "查询成功" :"查询失败");
        return new Result(code,course,msg);
    }
    @GetMapping("/{st_profession}")
    public Result getAll(@PathVariable String st_profession){
        List<Grade> Grade= gradeService.GetAll(st_profession);
        Integer code = Grade !=null ? Code.GET_OK:Code.GET_ERR;
        String msg = Grade!=null ? "查询成功" :"查询失败";
        System.out.println(Grade!=null ? "查询成功" :"查询失败");
        return new Result(code,Grade,msg);
    }

    @GetMapping("/grade/{st_id}")
    public Result getGrade(@PathVariable long st_id){
        List<Course> grade = gradeService.GetDistinctCourse(st_id);
        Integer code = grade != null ? Code.GET_OK:Code.GET_ERR;
        String msg = grade !=null ? "查询成功":"查询失败";
        System.out.println(grade!=null ? "查询成功":"查询失败");
        return new Result(code,grade,msg);

    }
    @GetMapping("/count/{st_profession}")
    public Result getGrade(@PathVariable String st_profession){
        List<Grade> grade = gradeService.GetCount(st_profession);
        Integer code = grade != null ? Code.GET_OK:Code.GET_ERR;
        String msg = grade !=null ? "查询成功":"查询失败";
        System.out.println(grade!=null ? "查询成功":"查询失败");
        return new Result(code,grade,msg);
    }
    @PutMapping
    public Result update(@RequestBody List<Course> list) {
        System.out.println(list);
        boolean flag = gradeService.updateGrade(list);
        return new Result(flag? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }
    @PostMapping
    public Result insGrade(@RequestBody  List<Course> list) {
        boolean flag =  gradeService.insGrade(list);
        System.out.println(flag);
        return new Result(flag? Code.SAVE_OK:Code.Save_ERR,flag);
    }
    @GetMapping("/percent")
    public Result getPercent(){
        String percent = gradeService.getPercent();
        Integer code = percent != null ? Code.GET_OK:Code.GET_ERR;
        String msg = percent !=null ? "查询成功":"查询失败";
        System.out.println(percent!=null ? "查询成功":"查询失败");
        return new Result(code,percent,msg);
    }
    @DeleteMapping("/{st_id}")
    public Result delete(@PathVariable long st_id) {
        boolean flag  = gradeService.deleteGrade(st_id);
        System.out.println(flag);
        return new Result(flag? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }
}
