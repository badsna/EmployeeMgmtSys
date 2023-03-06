//package com.example.employeemgmtsys.config;
//
//import com.example.employeemgmtsys.model.UserDtls;
//import com.example.employeemgmtsys.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//public class CustomUserDtlsService implements UserDetailsService {
//    @Autowired
//    private UserRepository repo;
//    @Override
//    public UserDetails loadUserByUsername(String em) throws UsernameNotFoundException {
//
//        try{
//            UserDtls u=repo.findByEmail(em);
//            if(u==null){
//                throw new UsernameNotFoundException("No user");
//            }
//            else{
//                return new CustomUserDtls(u);
//            }
//        }
//
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        return null;
//    }
//}
