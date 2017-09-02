package com.example.springsessiondemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    @RequestMapping("/")
    @ResponseBody
    public String home(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");


        if (user == null){
            return "用好未登录" + session.getId();
        } else {
            return "用好已登录" + session.getId();
        }
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request){
        User user = new User();
        user.setUsername("chf");
        user.setPassword("pass");
        request.getSession().setAttribute("user", user);

        return "登录成功 "  + request.getSession().getId();
    }
}
