package com.cos.blog.test;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    private int id;
    private String username;
    private String password;
    private String email;
}
