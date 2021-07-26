package dev.juniorpi.instagram.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IBoardMapper {
    void insertFile(@Param("fid") String fid,
                    @Param("name") String name,
                    @Param("type") String type,
                    @Param("file") byte[] fileBytes);
}
