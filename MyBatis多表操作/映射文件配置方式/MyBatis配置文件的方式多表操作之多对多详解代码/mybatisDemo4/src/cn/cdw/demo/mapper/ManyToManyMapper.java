package cn.cdw.demo.mapper;

import cn.cdw.demo.pojo.Student;

import java.util.List;

/**
 * @author DW-CHEN
 */
public interface ManyToManyMapper {
    public List<Student> findAll();
}
