package com.example.employeemgmtsys.controller;

import com.example.employeemgmtsys.model.UserDtls;
import com.example.employeemgmtsys.pojo.UserDtlsRequestPojo;
import com.example.employeemgmtsys.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @Autowired
    private UserService userService;
    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/createUser")
    //HttpSession chai frontend ma dakhauna ko lagi rakhya
    //
    public String createUser(@ModelAttribute UserDtlsRequestPojo userDtlsRequestPojo, HttpSession session){
       boolean f= userService.checkEmail(userDtlsRequestPojo.getEmail());
        if(f){
            //IDE ko console ma dakhauxa
            //System.out.println("Email id already exits");

            //System ko frontend ma dakhauxa
            //uta register.html ma th:block vanne  use garnu parxa jata dakhauna maan lagyo teyta tera
            session.setAttribute("msg","Email id already exits");
        }
        else{
            UserDtls userDtls= userService.createUser(userDtlsRequestPojo);
//        System.out.println(userDtlsRequestPojo);

            if(userDtls!=null){
//                System.out.println("registered successfully");
                session.setAttribute("msg","Register successfully");

            }
            else{
//                System.out.println("something wrong with server");
                session.setAttribute("msg","Something wrong with server");

            }
        }

        return  "redirect:/register";
        //refresh garya paxe data hatauna lai redirect use garyako ho
        //return "register" garya vaya same data db ma insert huntheyo after refershing  the createUser url
    }




}
