package com.lin.controller;

import com.lin.domain.User;
import com.lin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping
    public Result userLogin(HttpSession session, @RequestBody User user){
        User user1 = userService.selectOneUser(user.getUser());
        System.out.println("*--------------------*");
        if (user1 == null){
            return new Result(Code.POST_ERR,null,"账号或密码出错");
        }
        if (!user1.getPassword().equals(user.getPassword())){
            return new Result(Code.POST_ERR,null,"账号或密码出错");
        }
        session.setAttribute("user",user1);
        System.out.println(user1);
        return new Result(Code.POST_OK,user1,"登录成功");
    }

    @GetMapping
    public Result home(@SessionAttribute(required = false) User user) {
        System.out.println(user);
        if (user != null) {
            return new Result(Code.GET_OK,user,"已登录");
        } else {
            return new Result(Code.GET_ERR,null,"未登录");
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        System.out.println("logout");
        // 清除Session中的用户信息
        session.removeAttribute("user");
        // 返回登录页面
        return "redirect:/登录.html";
    }


}
