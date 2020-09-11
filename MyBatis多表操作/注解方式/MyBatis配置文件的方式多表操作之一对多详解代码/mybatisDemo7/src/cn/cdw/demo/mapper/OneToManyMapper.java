package cn.cdw.demo.mapper;

import cn.cdw.demo.pojo.Classes;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author DW-CHEN
 * 一对多关联关系
 */
public interface OneToManyMapper {

    @Select("select * from classes")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),

            @Result(
                    property = "studentList",javaType = List.class,
                    column = "id",

                    many = @Many(select = "cn.cdw.demo.mapper.StudentMapper.findById")
            )
    })
    public List<Classes> findAll();
}
