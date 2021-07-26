package dev.juniorpi.instagram.controllers;

import dev.juniorpi.instagram.enums.user.RegisterResult;
import dev.juniorpi.instagram.services.UserService;
import dev.juniorpi.instagram.dtos.UserDto;
import dev.juniorpi.instagram.enums.LoginResult;
import dev.juniorpi.instagram.vos.LoginVo;
import dev.juniorpi.instagram.vos.user.RegisterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping(value = "/")
@SessionAttributes(UserDto.MODEL_NAME)
public class UserController extends StandardController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(
            value = "/",
            method = RequestMethod.POST,
            produces = MediaType.TEXT_HTML_VALUE)
    public String loginPost(
            LoginVo loginVo,
            Model model,
            @ModelAttribute(UserDto.MODEL_NAME) UserDto user) {
        this.userService.login(loginVo);
        if (loginVo.getResult() == LoginResult.SUCCESS) {
            model.addAttribute(UserDto.MODEL_NAME, loginVo.getUser());
            return "board/feed";
        } else {
            model.addAttribute("vo", loginVo);
            return "user/login";
        }
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