package dev.juniorpi.instagram.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class RootController {
    @RequestMapping(
            value = "/",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE)
    public String RootGet() {
        return "user/login";
    }

    @RequestMapping(
            value = "/login",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE)
    public String LoginGet() {
        return "user/login";
    }

    @RequestMapping(
            value = "/register",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE)
    public String RegisterGet() {
       return "user/register";
    }
}
