package demo.mapper.user;

import demo.po.UserPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select id,name,password from dolphin_user")
    List<UserPo> selectAll();

    @Select("select id,name,password from dolphin_user where name = #{name}")
    UserPo selectOne(String name);
}
