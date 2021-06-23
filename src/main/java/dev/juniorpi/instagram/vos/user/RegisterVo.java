package dev.juniorpi.instagram.vos.user;

import dev.juniorpi.instagram.enums.user.RegisterResult;
import dev.juniorpi.instagram.interfaces.IResult;
import dev.juniorpi.instagram.utils.CryptoUtil;

public class RegisterVo implements IResult<RegisterResult> {
    private final String email;
    private final String name;
    private final String nickname;
    private final String password;
    private final String hashedPassword;
    private final String securityCode;

    private RegisterResult result;

    public RegisterVo(String email, String name, String nickname, String password, String securityCode) {
        this.email = email;
        this.name = name;
        this.nickname = nickname;
        this.password = password;
        this.hashedPassword = CryptoUtil.Sha512.hash(password, null);
        this.securityCode = securityCode;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getPassword() {
        return this.password;
    }

    public String getHashedPassword() {
        return this.hashedPassword;
    }

    @Override
    public RegisterResult getResult() {
        return this.result;
    }

    @Override
    public String getResultName() {
        return this.result == null ? null : this.result.name();
    }

    @Override
    public void setResult(RegisterResult registerResult) {
        this.result = registerResult;
    }
}
