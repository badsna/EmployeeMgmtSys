package com.example.employeemgmtsys.repository;

import com.example.employeemgmtsys.model.UserDtls;
import org.springframework.data.jpa.repository.JpaRepository;
//save,delete method call garna milxa
public interface UserRepository extends JpaRepository<UserDtls,Integer> {
    public boolean existsByEmail(String email);
    //yesko kaam ne service ma xa
    //already exist vako email id check garna lai
    public UserDtls findByEmail(String em);
}
