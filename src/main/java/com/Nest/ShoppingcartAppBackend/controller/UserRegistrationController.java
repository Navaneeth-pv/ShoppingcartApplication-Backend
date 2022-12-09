package com.Nest.ShoppingcartAppBackend.controller;

import com.Nest.ShoppingcartAppBackend.dao.UserRegistrationDao;
import com.Nest.ShoppingcartAppBackend.model.UserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@RestController

public class UserRegistrationController {

    @Autowired
    private UserRegistrationDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/adduser", consumes = "application/json", produces = "application/json")
    public String adduser(@RequestBody UserRegistration u){
        System.out.println(u.getName().toString());
        dao.save(u);
        return "user added Successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewuser")
    public List<UserRegistration> viewuser(){

        return (List<UserRegistration>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userlogin",consumes = "application/json", produces = "application/json")
    public HashMap<String, String> UserLogin(@RequestBody UserRegistration ul){
        System.out.println(ul.getEmail());
        List<UserRegistration> result= (List<UserRegistration>) UserRegistrationDao.FindUserLogin(ul.getEmail(),ul.getPassword());
        System.out.println(result);
        HashMap<String,String> st=new HashMap<>();
        if(result.size()==0) {
            st.put("status", "failed");
            st.put("message", "user doesn't exist");
        }
        else {
            int id =result.get(0).getId();
            st.put("userId",String.valueOf(id));
            st.put("status", "success");
            st.put("message", "user added successfully");
        }
        return st;
    }

    }
