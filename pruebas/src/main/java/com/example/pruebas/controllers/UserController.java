package com.example.pruebas.controllers;

import com.example.pruebas.Services.ThirdPartyService;
import com.example.pruebas.model.ThirdPartyUser;
import com.example.pruebas.model.User;
import com.example.pruebas.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   @Autowired
    private UserRepository userRepository;

   @Autowired
    private ThirdPartyService thirdPartyService;


   @PostMapping("/users")
    public void saveUser(@RequestBody User user){
       ThirdPartyUser thirdPartyUser = thirdPartyService.getThirdPartyUser(user.getId());
   }

}
