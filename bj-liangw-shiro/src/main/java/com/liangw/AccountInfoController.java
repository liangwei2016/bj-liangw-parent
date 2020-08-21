package com.liangw;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @ClassName AccountInfoController
 * @Description TODO
 * @Author liangw
 * @Date 2020/4/30 11:25
 * @Version 1.0
 **/
@Controller
public class AccountInfoController {

    @RequiresRoles("admin")
    @RequestMapping("/account-info")
    public String home(Model model) {

        String name = "World";

        Subject subject = SecurityUtils.getSubject();

        PrincipalCollection principalCollection = subject.getPrincipals();

        if (principalCollection != null && !principalCollection.isEmpty()) {
            name = principalCollection.getPrimaryPrincipal().toString();
        }

        model.addAttribute("name", name);

        return "account-info";
    }
}
