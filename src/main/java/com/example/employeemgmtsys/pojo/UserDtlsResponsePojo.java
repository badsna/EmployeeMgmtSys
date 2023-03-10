package com.example.employeemgmtsys.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Service
public class UserDtlsResponsePojo {
    private Integer id;
    private String fullName;
    private String email;
    private String address;
    private String qualification;
    private String password;
    private String role;


}
