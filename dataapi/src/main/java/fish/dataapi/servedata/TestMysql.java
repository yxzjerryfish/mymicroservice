package fish.dataapi.servedata;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMysql {
    @Select("select count(*) from time_zone")
    public Integer getCount();
}
