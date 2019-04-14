package demo.mapper.current;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CurrentMapper {
    @Select("select concat('非走不可的弯路~ ',current_timestamp)")
    String selectCurrentDate();
}
