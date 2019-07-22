package com.example.loginform.controllers;
import com.example.loginform.models.User;
import com.example.loginform.repositories.LoginRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private final LoginRepository loginRepository;

    public LoginController(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

//    @GetMapping("/")
//        public String home(User user){
//            return "home";
//        }
//
//
//    @PostMapping("/")
//        public void login(@RequestBody User user){
//
//        }
//
//
//    @GetMapping("/register")
//        public String register(User user){
//            return "register";
//        }
//
//
//    @PostMapping("/register")
//        public void addUser(@RequestBody User user){
//
//        }


}

