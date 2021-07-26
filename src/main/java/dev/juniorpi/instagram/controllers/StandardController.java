package dev.juniorpi.instagram.controllers;

import dev.juniorpi.instagram.dtos.UserDto;
import org.springframework.web.bind.annotation.ModelAttribute;

public abstract class StandardController {
    @ModelAttribute(UserDto.MODEL_NAME)
    protected final UserDto userDto() {return null;}
}
