package dev.juniorpi.instagram.controllers;

import dev.juniorpi.instagram.dtos.UserDto;
import dev.juniorpi.instagram.services.UserService;
import dev.juniorpi.instagram.vos.SelectVo;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.io.IOException;

@Controller
@RequestMapping(value = "/board/",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
// @SessionAttributes(UserDto.MODEL_NAME)
public class BoardController {
    private final UserService userService;

    @Autowired
    public BoardController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/write/select")
    public String select(SelectVo selectVo) throws IOException {
        this.userService.select(selectVo);

        JSONObject jsonObject = new JSONObject();
        return "board/write/select";
    }

    @RequestMapping(
            value = "/feed",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE)
    public String feedGet() {
        return "board/feed";
    }
}
