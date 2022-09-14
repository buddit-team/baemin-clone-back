package com.woowahanmope.baeminCloneProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
    @GetMapping("/home")
    public String home(){
        return "안녕하세요. Home 입니다";
    }
}
