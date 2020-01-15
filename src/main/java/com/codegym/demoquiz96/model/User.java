package com.codegym.demoquiz96.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Table(name = "userTable")
public class User implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String confirmPassword;
    private String oldPassword;
    private String firstName;
    private String lastName;
    @Email
    @Column(unique = true,nullable = false)
    private String email;
    private String phoneNumber;
    private String gender;
    private String avatar;
    private boolean enabled;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="user_role",
    joinColumns = {@JoinColumn(name ="user_id" )},
    inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles;
}
