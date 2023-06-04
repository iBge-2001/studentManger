package com.lin.controller;

import com.lin.domain.Academy;
import com.lin.domain.ClassDetail;
import com.lin.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Class")
public class ClassController {
    @Autowired
    private ClassService classService;
    @GetMapping("/academy")
    public Result getAcademy() {
        List<String> Academy = classService.getByAcademyName();
        Integer code = Academy !=null ? Code.GET_OK:Code.GET_ERR;
        String msg = Academy!=null ? "查询成功" :"查询失败";
        System.out.println(Academy!=null ? "查询成功" :"查询失败");
        return new Result(code,Academy,msg);
    }
    @GetMapping("/ByAcdemy/{academy}")
    public Result getAll(@PathVariable String academy) {
        List<ClassDetail> classList = classService.getAll(academy);
        Integer code = classList !=null ? Code.GET_OK:Code.GET_ERR;
        String msg = classList!=null ? "查询成功" :"查询失败";
        System.out.println(classList!=null ? "查询成功" :"查询失败");
        return new Result(code,classList,msg);
    }
    @GetMapping("/{classname}")
    public Result getByClass(@PathVariable String classname) {
        ClassDetail classDetail = classService.getByclass(classname);
        Integer code = classDetail !=null ? Code.GET_OK:Code.GET_ERR;
        String msg = classDetail!=null ? "查询成功" :"查询失败";
        System.out.println(classDetail!=null ? "查询成功" :"查询失败");
        return new Result(code,classDetail,msg);
    }
    @GetMapping("/avgcount")
    public Result getAvgCount() {
        String Count = classService.getAvgCount();
        Integer code = Count !=null ? Code.GET_OK:Code.GET_ERR;
        String msg = Count!=null ? "查询成功" :"查询失败";
        System.out.println(Count!=null ? "查询成功" :"查询失败");
        return new Result(code,Count,msg);
    }
    @GetMapping("/classcount")
    public Result getClassCount() {
        String Count = classService.getClassCount();
        Integer code = Count !=null ? Code.GET_OK:Code.GET_ERR;
        String msg = Count!=null ? "查询成功" :"查询失败";
        System.out.println(Count!=null ? "查询成功" :"查询失败");
        return new Result(code,Count,msg);
    }

}
