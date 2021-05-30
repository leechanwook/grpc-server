package com.cu.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@Controller
public class TestController {

    @GetMapping("/test")
    public String test(String test, ModelMap model){
        log.debug("test["+test+"]");
        model.addAttribute("test", "test");

        return "jsonView";
    }
}
