package com.example.employeemgmtsys.config;

import com.example.employeemgmtsys.model.UserDtls;
import com.example.employeemgmtsys.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//prebulit ho userdetailsservice
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository repo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

            UserDtls user=repo.findByEmail(email);
            if(user!=null){
                return new CustomUserDtls(user);

            }
        throw new UsernameNotFoundException("No user");

        }
    }

