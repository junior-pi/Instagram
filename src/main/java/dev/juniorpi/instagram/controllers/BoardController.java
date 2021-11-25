package dev.juniorpi.instagram.controllers;

import dev.juniorpi.instagram.dtos.UserDto;
import dev.juniorpi.instagram.services.UserService;
import dev.juniorpi.instagram.vos.SelectVo;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.io.IOException;

@Controller
@RequestMapping(value = "/board")
@SessionAttributes(UserDto.MODEL_NAME)
public class BoardController {
    private final UserService userService;

    @Autowired
    public BoardController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(
            value = "/write/select",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE)
    public String selectGet() {
        return "board/write/select";
    }

    @RequestMapping(
            value = "/write/select",
            method = RequestMethod.POST,
            produces = MediaType.TEXT_HTML_VALUE)
    public String selectPost(SelectVo selectVo) throws IOException {
        userService.select(selectVo);

        System.out.println(selectVo.getFile());

        return "board/write/detail";
    }

//    @RequestMapping(value = "/write/detail")
//    public String detailGet() {
//        return "board/write/detail";
//    }
}
