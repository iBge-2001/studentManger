package com.lin.controller;

import com.lin.domain.Student;
import com.lin.domain.User;
import com.lin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping()
    public Result getAll(){
        List<User> all = userService.getAll();
        Integer code = all !=null ? Code.GET_OK:Code.GET_ERR;
        String msg = all!=null ? "查询成功" :"查询失败";
        System.out.println(all!=null ? "查询成功" :"查询失败");
        return new Result(code,all,msg);
    }
    @PostMapping
    public Result save(@RequestBody User user) {
        boolean flag =  userService.save(user);
        System.out.println(flag);
        return new Result(flag? Code.SAVE_OK:Code.Save_ERR,flag);
    }
    @PutMapping
    public Result updatePwd(HttpSession session, @RequestBody User user){
        User user1 = (User) session.getAttribute("user");
        user1.setNewPassword(user.getNewPassword());
        System.out.println("\n"+user+"\n");
        System.out.println("\n"+user1+"\n");
        Boolean aBoolean = userService.updatePwd(user1);
        System.out.println(aBoolean);
        return new Result(aBoolean? Code.UPDATE_OK:Code.UPDATE_ERR,aBoolean);
    }
}
