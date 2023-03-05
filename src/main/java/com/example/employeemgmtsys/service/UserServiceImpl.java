package com.example.employeemgmtsys.service;

import com.example.employeemgmtsys.model.UserDtls;
import com.example.employeemgmtsys.pojo.UserDtlsRequestPojo;
import com.example.employeemgmtsys.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    public final UserRepository userRepository;
    public final UserDtlsRequestPojo userDtlsRequestPojo;
    public final ObjectMapper objectMapper;

    public UserDtls createUser(UserDtlsRequestPojo userDtlsRequestPojo){
        UserDtls userDtls;
        if(userDtlsRequestPojo.getId()!=null){
            userDtls=userRepository.findById(userDtlsRequestPojo.getId()).orElse(new UserDtls());
        }
        userDtls=objectMapper.convertValue(userDtlsRequestPojo,UserDtls.class);
       return userRepository.save(userDtls);
    }


    public boolean checkEmail(String email){
        return userRepository.existsByEmail(email);
    }
}
