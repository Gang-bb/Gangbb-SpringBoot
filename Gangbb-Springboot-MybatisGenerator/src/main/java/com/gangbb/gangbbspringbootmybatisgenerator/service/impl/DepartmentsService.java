package com.gangbb.gangbbspringbootmybatisgenerator.service.impl;

import com.gangbb.gangbbspringbootmybatisgenerator.model.pojo.Departments;

/**
* @ClassName : DepartmentsService
* @Description :
* @author : Gangbb
* @Date : 2021/1/27 9:01
*/

public interface DepartmentsService{


int deleteByPrimaryKey(Integer departmentId);

int insert(Departments record);

int insertSelective(Departments record);

Departments selectByPrimaryKey(Integer departmentId);

int updateByPrimaryKeySelective(Departments record);

int updateByPrimaryKey(Departments record);

}
