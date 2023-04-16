package com.lin.controller;


import com.lin.domain.Academy;
import com.lin.domain.Student;
import com.lin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    public Result save(@RequestBody Student student) {
        boolean flag =  studentService.save(student);
        System.out.println(flag);
        return new Result(flag? Code.SAVE_OK:Code.Save_ERR,flag);
    }
    @PutMapping
    public Result update(@RequestBody Student student) {
        boolean flag = studentService.update(student);
        return new Result(flag? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag  = studentService.delete(id);
        System.out.println(flag);
        return new Result(flag? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable long id) {
        System.out.println(id);
        Student student =  studentService.getById(id);
        Integer code = student!=null ? Code.GET_OK:Code.GET_ERR;
        String msg = student!=null ? "查询成功" :"查询失败";
        return new Result(code,student,msg);
    }
    @GetMapping("/all")
    public Result getAll() {
        List<Student> all = studentService.getAll();
        Integer code = all !=null ? Code.GET_OK:Code.GET_ERR;
        String msg = all!=null ? "查询成功" :"查询失败";
        System.out.println(all!=null ? "查询成功" :"查询失败");
        return new Result(code,all,msg);
    }
    @GetMapping("/FuzzySelect/{object}")
    public Result getByFuzzy(@PathVariable Object object) {
        System.out.println(object);
        List<Student>  list=  studentService.getFuzzy(object);
        Integer code = list!=null ? Code.GET_OK:Code.GET_ERR;
        String msg = list!=null ? "查询成功" :"查询失败";
        return new Result(code,list,msg);
    }
}
