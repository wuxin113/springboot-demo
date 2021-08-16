package com.wuxin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author wuxin
 * @date 2021-02-12
 */
@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String login(String username, String password, Model model, HttpSession session) {

        if (!StringUtils.isEmpty(username) && "123".equals(password)) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg", "用户名或者密码错误");
            return "index";
        }

    }

}
