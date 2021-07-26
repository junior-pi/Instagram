package dev.juniorpi.instagram.mappers;

import dev.juniorpi.instagram.dtos.UserDto;
import dev.juniorpi.instagram.vos.LoginVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserMapper {
    UserDto selectUser(LoginVo loginVo);
}
