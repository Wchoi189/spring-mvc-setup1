package com.carrot.springmvc.app.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {


    @GetMapping("/")
    public String hello() {
        System.out.println("controller here..");
        return "html/index.html";
    }

    @GetMapping("jsp")
    public String jspPage() {
        return "jsp/index.jsp";
    }
}
