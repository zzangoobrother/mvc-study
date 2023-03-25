package org.example.reflection.study.controller;

import org.example.reflection.study.annotation.Controller;
import org.example.reflection.study.annotation.RequestMapping;
import org.example.reflection.study.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HealthCheckController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(HttpServletRequest request, HttpServletResponse response) {
        return "ok";
    }
}
