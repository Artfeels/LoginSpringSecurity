package com.example.loginform.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;


@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 5)
    private String unsername;
    @Size(min = 8)
    private String password;
    private Date creationDate;
    @Enumerated(EnumType.STRING)
    private Role role;
}
