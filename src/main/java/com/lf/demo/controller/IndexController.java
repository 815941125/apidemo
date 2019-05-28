package com.lf.demo.controller;

import com.lf.demo.annotation.ApiIdempotent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linfei
 * @version 1.0
 * @date 2019/5/27
 * @desc
 * @see
 * @since 1.0
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    @ApiIdempotent
    public String index() {
        return "hello";
    }
}
