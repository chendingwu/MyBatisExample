package cn.cdw.demo.mapper;

import cn.cdw.demo.pojo.Course;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author DW-CHEN
 * 多对多
 */
public interface ManyToManyMapper {

    @Select("select * from course")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),

            @Result(
                    property = "studentList",javaType = List.class,
                    column = "id",

                    many = @Many(select = "cn.cdw.demo.mapper.StudentMapper.findById")
            )
    })
    public List<Course> findAll();
}
