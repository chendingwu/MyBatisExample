package cn.cdw.demo.mapper;

import cn.cdw.demo.pojo.Persion;
import org.apache.ibatis.annotations.Select;

/**
 * @author DW-CHEN
 * 被包含的表，提供一个根据id查询出被包含表的数据
 *
 * 注意：如果被包含的表是从表则根据主键id条件查询，如果被保含的表是主表则根据外键id查询
 */
public interface PersionMapper {
    @Select("select * from persion where id = #{id}")
    public Persion findById(Integer id);
}
