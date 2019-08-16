package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController
{
    @PostMapping("/save")
    public ModelAndView getName(HttpServletRequest a)
    {
        String str = a.getParameter("t1");
        ModelAndView mv = new ModelAndView("display");
        mv.addObject("a", str);
        return mv;
    }
}