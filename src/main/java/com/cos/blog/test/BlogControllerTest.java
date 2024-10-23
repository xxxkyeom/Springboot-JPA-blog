package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 스프링이 해당 패키지 이하의 모든 component/bean scan
public class BlogControllerTest {

    @GetMapping("/test/hello")
    public String hello() {
        return "hello Spring Boot !";
    }
}
