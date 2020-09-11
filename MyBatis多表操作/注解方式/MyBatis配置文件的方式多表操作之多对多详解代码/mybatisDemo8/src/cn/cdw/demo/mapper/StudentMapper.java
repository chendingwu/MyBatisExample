package cn.cdw.demo.mapper;

import cn.cdw.demo.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author DW-CHEN
 * 查询被包含的表数据
 */
public interface StudentMapper {

    @Select("SELECT s.id,s.name,s.age FROM student s,stu_cou sc WHERE sc.s_id = s.id AND sc.c_id = #{id}")
    public List<Student> findById(String id);

}
