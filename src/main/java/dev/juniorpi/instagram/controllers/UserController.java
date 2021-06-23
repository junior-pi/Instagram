package dev.juniorpi.instagram.controllers;

import dev.juniorpi.instagram.enums.user.RegisterResult;
import dev.juniorpi.instagram.services.UserService;
import dev.juniorpi.instagram.vos.user.RegisterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/user/")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(
            value = "/register",
            method = RequestMethod.POST,
            produces = MediaType.TEXT_HTML_VALUE)
    public String registerPost(RegisterVo registerVo, Model model) {
        this.userService.register(registerVo);
        System.console();
        if (registerVo.getResult() == RegisterResult.SUCCESS) {
            return "user/login";
        } else {
            model.addAttribute("vo", registerVo);
            return "user/register";
        }
    }
}
