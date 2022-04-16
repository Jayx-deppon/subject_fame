package com.subject_fame.subject_fame_web.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Slf4j
@RestController
@Api(tags = "swagger测试demo类")
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(@RequestParam String test) {
        if(Objects.nonNull(test)){
            return "hello world";
        }else {
            log.error("参数不正确");
            return null;
        }
    }

}
