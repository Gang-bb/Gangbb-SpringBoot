package com.gangbb.gangbbspringbootmybatisgenerator.model.dao;

import com.gangbb.gangbbspringbootmybatisgenerator.model.pojo.Departments;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName : DepartmentsMapper
 * @Description :
 * @author : Gangbb
 * @Date : 2021/1/27 9:01
 */

@Mapper
public interface DepartmentsMapper {
    int deleteByPrimaryKey(Integer departmentId);

    int insert(Departments record);

    int insertSelective(Departments record);

    Departments selectByPrimaryKey(Integer departmentId);

    int updateByPrimaryKeySelective(Departments record);

    int updateByPrimaryKey(Departments record);
}