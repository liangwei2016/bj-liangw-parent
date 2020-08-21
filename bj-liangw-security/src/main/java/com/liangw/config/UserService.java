//package com.liangw.config;
//
//import com.liangw.pojo.OrgCredencePwd;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
///**
// * @ClassName UserService
// * @Description TODO
// * @Author liangw
// * @Date 2020/4/24 18:25
// * @Version 1.0
// **/
//@Component
//public class UserService implements UserDetailsService {
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//
//        // 通过用户名s去数据库里查找用户以及用户权限
//        // 然后返回User对象，注意，这里的User对象是org.springframework.security.core.userdetails.User
//        // return new User(s,new BCryptPasswordEncoder().encode("123456"),AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN,ROLE_USER"));
//        List<GrantedAuthority> authorityLists = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN,ROLE_USER");
//        OrgCredencePwd loginUser = new OrgCredencePwd(s,new BCryptPasswordEncoder().encode("123456"),authorityLists);
//        loginUser.setNickName("*焦宇");
//        return loginUser;
//    }
//
//}
