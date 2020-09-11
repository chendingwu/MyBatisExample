package cn.cdw.demo.mapper;

import cn.cdw.demo.pojo.Card;
import cn.cdw.demo.pojo.Persion;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author DW-CHEN
 * 多对多
 */
public interface OneToOneMapper {

    @Select("select * from card")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),

            @Result(
                    property = "persion",javaType = Persion.class,
                    column = "p_id",

                    one = @One(select = "cn.cdw.demo.mapper.PersionMapper.findById")
            )
    })
    public List<Card> oneToOne();
}
