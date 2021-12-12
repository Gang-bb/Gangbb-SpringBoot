package com.gangbb.gangbbspringbootmybatisgenerator.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.gangbb.gangbbspringbootmybatisgenerator.model.dao.DepartmentsMapper;
import com.gangbb.gangbbspringbootmybatisgenerator.model.pojo.Departments;
import com.gangbb.gangbbspringbootmybatisgenerator.service.impl.DepartmentsService;

/**
 * @ClassName : DepartmentsServiceImpl
 * @Description :
 * @author : Gangbb
 * @Date : 2021/1/27 9:01
 */

@Service
public class DepartmentsServiceImpl implements DepartmentsService {

    @Resource
    private DepartmentsMapper departmentsMapper;

    @Override
    public int deleteByPrimaryKey(Integer departmentId) {
        return departmentsMapper.deleteByPrimaryKey(departmentId);
    }

    @Override
    public int insert(Departments record) {
        return departmentsMapper.insert(record);
    }

    @Override
    public int insertSelective(Departments record) {
        return departmentsMapper.insertSelective(record);
    }

    @Override
    public Departments selectByPrimaryKey(Integer departmentId) {
        return departmentsMapper.selectByPrimaryKey(departmentId);
    }

    @Override
    public int updateByPrimaryKeySelective(Departments record) {
        return departmentsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Departments record) {
        return departmentsMapper.updateByPrimaryKey(record);
    }

}
