package dev.juniorpi.instagram.dtos;

public class UserDto {
    public static final String MODEL_NAME = "userDto";

    private final int index;
    private final String email;
    private final String name;
    private final String nickname;
    private final String password;
    private final int level;

    public UserDto(int index, String email, String name, String nickname, String password, int level) {
        this.index = index;
        this.email = email;
        this.name = name;
        this.nickname = nickname;
        this.password = password;
        this.level = level;
    }

    public int getIndex() {
        return this.index;
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

    public int getLevel() {
        return level;
    }
}
