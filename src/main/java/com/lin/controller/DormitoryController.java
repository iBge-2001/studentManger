package com.lin.controller;

import com.lin.dao.DormitoryDao;
import com.lin.domain.Academy;
import com.lin.domain.Dormitory;
import com.lin.domain.Student;
import com.lin.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Dormitory")
public class DormitoryController {
    @Autowired
    private DormitoryService dormitoryService;
    @GetMapping()
    public Result getProfession() {
        List<Dormitory> dormitory = dormitoryService.getDormitory();
        Integer code = dormitory !=null ? Code.GET_OK:Code.GET_ERR;
        String msg = dormitory!=null ? "查询成功" :"查询失败";
        System.out.println(dormitory!=null ? "查询成功" :"查询失败");
        return new Result(code,dormitory,msg);
    }
    @GetMapping("/{id}")
    public Result getAll(@PathVariable long id) {
        Dormitory dormitory = dormitoryService.selectById(id);
        Integer code = dormitory !=null ? Code.GET_OK:Code.GET_ERR;
        String msg = dormitory!=null ? "查询成功" :"查询失败";
        System.out.println(dormitory!=null ? "查询成功" :"查询失败");
        return new Result(code,dormitory,msg);
    }

    @GetMapping("/GetOne/{id}")
    public Result getOne(@PathVariable long id) {
        Dormitory dormitory = dormitoryService.selectById(id);
        List<Dormitory> dormitories = new ArrayList<>();
        dormitories.add(dormitory);
        Integer code = dormitory !=null ? Code.GET_OK:Code.GET_ERR;
        String msg = dormitory!=null ? "查询成功" :"查询失败";
        System.out.println(dormitory!=null ? "查询成功" :"查询失败");
        return new Result(code,dormitories,msg);
    }

    @PutMapping
    public Result update(@RequestBody Dormitory dormitory) {
        boolean flag = dormitoryService.update(dormitory);
        return new Result(flag? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag  = dormitoryService.delete(id);
        System.out.println(flag);
        return new Result(flag? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }
    @GetMapping("/FuzzySelect/{object}")
    public Result getByFuzzy(@PathVariable Object object) {
        System.out.println(object);
        List<Dormitory> list=  dormitoryService.getFuzzy(object);
        Integer code = list!=null ? Code.GET_OK:Code.GET_ERR;
        String msg = list!=null ? "查询成功" :"查询失败";
        return new Result(code,list,msg);
    }
}
