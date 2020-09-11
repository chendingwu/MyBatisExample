package cn.cdw.demo.mapper;

import cn.cdw.demo.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author DW-CHEN
 * 注意：如果被包含的表是从表则根据主键id条件查询，如果被保含的表是主表则根据外键id查询
 */
public interface StudentMapper {

    @Select("select * from student where c_id = #{id}")
    public List<Student> findById(String id);
}
