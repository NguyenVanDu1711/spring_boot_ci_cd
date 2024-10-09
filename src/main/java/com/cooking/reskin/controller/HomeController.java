package com.cooking.reskin.controller;


import org.springframework.scheduling.config.TaskNamespaceHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/ci_cd")
    public String index(){
        return "start ci/cd new 123";
    }
    @GetMapping("/test")
    public String test(){
        return "bc";
    }
	 @GetMapping("/test1")
    public String test2(){
		
        return "bc3";
    }

    public TaskNamespaceHandler
}
