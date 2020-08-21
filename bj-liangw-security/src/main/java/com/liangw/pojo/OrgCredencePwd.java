//package com.liangw.pojo;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//
//import java.util.Collection;
//
///**
// * @ClassName OrgCredencePwd
// * @Description TODO
// * @Author liangw
// * @Date 2020/4/24 18:30
// * @Version 1.0
// **/
//public class OrgCredencePwd extends User{
//
//    private String nickName;
//
//    public OrgCredencePwd(){
//        super("", "", true, true, true, true, null);
//    }
//
//    public OrgCredencePwd(String username, String password, Collection<? extends GrantedAuthority> authorities) {
//        super(username, password, authorities);
//    }
//
//    public OrgCredencePwd(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
//        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
//    }
//
//    public String getNickName() {
//        return nickName;
//    }
//
//    public void setNickName(String nickName) {
//        this.nickName = nickName;
//    }
//}
