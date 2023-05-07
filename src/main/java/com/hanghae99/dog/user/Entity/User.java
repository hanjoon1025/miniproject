package com.hanghae99.dog.user.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "users")
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Enumerated(value = EnumType.STRING)
    private UserRoleEnum role;
    private Long kakaoId;
    @Column(unique = true)
    private String email;

    public User(String username, String password, UserRoleEnum role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public User(String username, Long kakaoId, String password, String email, UserRoleEnum role) {
        this.username = username;
        this.kakaoId = kakaoId;
        this.password = password;
        this.email = email;
        this.role = role;
    }
}
