package dev.juniorpi.instagram.services;

import dev.juniorpi.instagram.dtos.UserDto;
import dev.juniorpi.instagram.enums.LoginResult;
import dev.juniorpi.instagram.mappers.IUserMapper;
import dev.juniorpi.instagram.securities.Regexs;
import dev.juniorpi.instagram.vos.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final IUserMapper userMapper;

    @Autowired
    public UserService(IUserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public static boolean checkEmail(String email) {
        return email.matches(Regexs.EMAIL);
    }

    public static boolean checkName(String name) {
        return name.matches(Regexs.NAME);
    }

    public static boolean checkNickname(String nickname) {
        return nickname.matches(Regexs.NICKNAME);
    }

    public static boolean checkPassword(String password) {
        return password.matches(Regexs.PASSWORD);
    }

    public void login(LoginVo loginVo) {
        if (!UserService.checkEmail(loginVo.getEmail())) {
            loginVo.setResult(LoginResult.FAILURE);
            return;
        }
        UserDto user = this.userMapper.selectUser(loginVo);
        if (user == null) {
            loginVo.setResult(LoginResult.FAILURE);
        }
        if (user.getLevel() == 10) {
            loginVo.setResult(LoginResult.UNAVAILABLE);
        }
        loginVo.setResult(LoginResult.SUCCESS);
        loginVo.setUser(user);
    }
}
