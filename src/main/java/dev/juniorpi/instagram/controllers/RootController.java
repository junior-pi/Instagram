package dev.juniorpi.instagram.controllers;

import dev.juniorpi.instagram.dtos.UserDto;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.print.attribute.standard.Media;

@Controller
@RequestMapping(value = "/")
public class RootController extends StandardController {
//    TODO: ROOTController 에는 GET메서드들만?? USER에는 POST만?

    @RequestMapping(
            value = "/",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE)
    public String rootGet(@ModelAttribute(UserDto.MODEL_NAME) UserDto user) {
        if (user != null) {
            return "board/feed";
        }
        return "user/login";
    }

    @RequestMapping(
            value = "/register",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE)
    public String RegisterGet() {
        return "user/register";
    }

    @RequestMapping(
            value = "/feed",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE)
    public String FeedGet() {
//        USER == null 이면 loginGET 으로 돌리기
        return "board/feed";
    }

    @RequestMapping(
            value = "/direct",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE)
    public String DirectGet() {
        return "talk/direct";
    }

    @RequestMapping(
            value = "/userprofile",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE)
    public String UserProfileGet() {
        return "profile/userprofile";
    }
}
