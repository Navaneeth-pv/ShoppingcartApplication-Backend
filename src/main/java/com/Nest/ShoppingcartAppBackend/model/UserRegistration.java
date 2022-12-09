package com.Nest.ShoppingcartAppBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "userregistration")

public class UserRegistration {

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String phonenumber;
    private String address;
    private String email;
    private String username;
    private String password;
    private String confirmpassword;


    public UserRegistration(){}

    public UserRegistration(int id, String name, String phonenumber, String address, String email, String username, String password, String confirmpassword) {
        this.id = id;
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
        this.email = email;
        this.username = username;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
}
