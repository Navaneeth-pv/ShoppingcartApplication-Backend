package com.Nest.ShoppingcartAppBackend.controller;

import com.Nest.ShoppingcartAppBackend.dao.UserRegistrationDao;
import com.Nest.ShoppingcartAppBackend.model.UserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController

public class UserRegistrationController {

    @Autowired
    private UserRegistrationDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/adduser", consumes = "application/json", produces = "application/json")
    public HashMap<String adduser(@RequestBody UserRegistration u){
        System.out.println(u.getName().toString());
        dao.save(u);
        return "user added Successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewuser")
    public List<UserRegistration> viewuser(){

        return (List<UserRegistration>) dao.findAll();
    }



}
