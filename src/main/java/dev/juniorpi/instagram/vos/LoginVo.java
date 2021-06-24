package dev.juniorpi.instagram.vos;

import dev.juniorpi.instagram.dtos.UserDto;
import dev.juniorpi.instagram.enums.LoginResult;
import dev.juniorpi.instagram.utils.CryptoUtil;

public class LoginVo {
    private final String email;
    private final String password;
    private final String hashedPassword;

    private LoginResult result;
    private UserDto user;

    public LoginVo(String email, String password, String hashedPassword) {
        this.email = email;
        this.password = password;
        this.hashedPassword = CryptoUtil.Sha512.hash(password, null);
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getHashedPassword() {
        return this.hashedPassword;
    }

    public LoginResult getResult() {
        return result;
    }

    public void setResult(LoginResult result) {
        this.result = result;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
