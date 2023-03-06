//package com.example.employeemgmtsys.config;
//
//import com.example.employeemgmtsys.model.UserDtls;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.HashSet;
//
////yata UserDetails vanya prebulit ho
//public class CustomUserDtls implements UserDetails {
//    private UserDtls u;
//
//    public CustomUserDtls(UserDtls u) {
////        super();
//        this.u = u;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        HashSet<SimpleGrantedAuthority> set=new HashSet<SimpleGrantedAuthority>();
//        set.add(new SimpleGrantedAuthority(u.getRole()));
//        return set;
//    }
//
//    @Override
//    public String getPassword() {
//        return u.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return u.getEmail();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
