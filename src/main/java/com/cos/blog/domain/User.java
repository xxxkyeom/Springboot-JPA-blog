package com.cos.blog.domain;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity // 클래스를 데이터베이스를 매핑해주는 역할
@EntityListeners(AuditingEntityListener.class)
@Getter
public class User {

    @Id // 기본 키
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 넘버링 전략
    private int id;

    @Column(length = 30, nullable = false)
    private String username;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 50, nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @ColumnDefault("'USER'")
    private Role role; // 열거형 타입으로 생성, admin user manager 시큐리티 관련 필드

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime updateDate;
}
