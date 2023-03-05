package com.example.employeemgmtsys.service;

import com.example.employeemgmtsys.model.UserDtls;
import com.example.employeemgmtsys.pojo.UserDtlsRequestPojo;

//user ko operation sab service  ma garxa
public interface UserService {
//post garna request garya so
    public UserDtls createUser(UserDtlsRequestPojo userDtlsRequestPojo);

    public boolean checkEmail(String email);
}
