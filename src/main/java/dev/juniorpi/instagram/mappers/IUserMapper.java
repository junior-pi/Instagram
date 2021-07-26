package dev.juniorpi.instagram.mappers;

import dev.juniorpi.instagram.dtos.UserDto;
import dev.juniorpi.instagram.vos.LoginVo;
import dev.juniorpi.instagram.vos.user.RegisterVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;



@Mapper
public interface IUserMapper {
    UserDto selectUser(LoginVo loginVo);

    int selectEmailCount(@Param("email") String email);

    int selectNicknameCount(@Param("nickname") String nickname);

    void insertUser(RegisterVo registerVo);
}
