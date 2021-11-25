package dev.juniorpi.instagram.services;

import dev.juniorpi.instagram.dtos.UserDto;
import dev.juniorpi.instagram.enums.LoginResult;
import dev.juniorpi.instagram.mappers.IBoardMapper;
import dev.juniorpi.instagram.mappers.IUserMapper;
import dev.juniorpi.instagram.vos.LoginVo;
import dev.juniorpi.instagram.vos.SelectVo;
import dev.juniorpi.instagram.enums.user.RegisterResult;
import dev.juniorpi.instagram.securities.Regex;
import dev.juniorpi.instagram.vos.user.RegisterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class UserService {
    private final IUserMapper userMapper;
    private final IBoardMapper boardMapper;

    @Autowired
    public UserService(IUserMapper userMapper, IBoardMapper boardMapper) {
        this.userMapper = userMapper;
        this.boardMapper = boardMapper;
    }

    public static boolean checkEmail(String email) {
        return email.matches(Regex.EMAIL);
    }

    public static boolean checkName(String name) {
        return name.matches(Regex.NAME);
    }

    public static boolean checkNickname(String nickname) {
        return nickname.matches(Regex.NICKNAME);
    }

    public static boolean checkPassword(String password) {
        return password.matches(Regex.PASSWORD);
    }

    public static boolean checkSecurityCode(String securityCode) {
        return securityCode.matches(Regex.SECURITY_CODE);
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

    public void select(SelectVo selectVo) throws IOException {
        boardMapper.insertFile(
                selectVo.getFid(),
                selectVo.getName(),
                selectVo.getType(),
                selectVo.getFile().getBytes());
    }

    public void register(RegisterVo registerVo) {
        if (!UserService.checkEmail(registerVo.getEmail()) ||
                !UserService.checkNickname(registerVo.getNickname())) {
            registerVo.setResult(RegisterResult.FAILURE);
        }
        if (this.userMapper.selectEmailCount(registerVo.getEmail()) > 0) {
            registerVo.setResult(RegisterResult.DUPLICATE_EMAIL);
            return;
        }
        if (this.userMapper.selectNicknameCount(registerVo.getNickname()) > 0) {
            registerVo.setResult(RegisterResult.DUPLICATE_NICKNAME);
            return;
        }
        //TODO securityCode Check

        this.userMapper.insertUser(registerVo);
        registerVo.setResult(RegisterResult.SUCCESS);
    }

    public void sendSecurityCode() {

    }
}
