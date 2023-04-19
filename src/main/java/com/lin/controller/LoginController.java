package com.lin.controller;

import com.lin.domain.User;
import com.lin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping()
    public Result userLogin(HttpServletRequest request, @RequestBody User user){
        User user1 = userService.selectOneUser(user.getUser());
        System.out.println("*--------------------*");
        if (user1 == null){
            return new Result(Code.POST_ERR,null,"账号或密码出错");
        }
        if (!user1.getPassword().equals(user.getPassword())){
            return new Result(Code.POST_ERR,null,"账号或密码出错");
        }
        request.getSession().setAttribute("user",user.getUser());
        return new Result(Code.POST_OK,null,"登录成功");
    }

}
