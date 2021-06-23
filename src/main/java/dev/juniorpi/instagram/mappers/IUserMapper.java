package dev.juniorpi.instagram.mappers;

import dev.juniorpi.instagram.vos.user.RegisterVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IUserMapper {
    int selectEmailCount(@Param("email") String email);

    int selectNicknameCount(@Param("nickname") String nickname);

    void insertUser(RegisterVo registerVo);
}
