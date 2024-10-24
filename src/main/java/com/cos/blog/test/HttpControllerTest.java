package com.cos.blog.test;

import org.springframework.web.bind.annotation.*;

@RestController
public class HttpControllerTest {

    // 웹 브라우저 요청은 get 방식만 가능하다!!
    @GetMapping("/http/get")
    public String getTest(Member member) {
        return "get 요청";
    }

    @PostMapping("/http/post") // httpmessageconverter!!
    public String postTest(@RequestBody Member member) {
        return "post 요청";
    }

    @PutMapping("/http/put")
    public String putTest() {
        return "put 요청";
    }

    @DeleteMapping("/http/delete")
    public String deleteTest() {
        return "delete 요청";
    }
}
