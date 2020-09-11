package cn.cdw.demo.mapper;

import cn.cdw.demo.pojo.Classes;

import java.util.List;

/**
 * @author DW-CHEN
 */
public interface OneToManyMapper {
    public List<Classes> findAll();
}
