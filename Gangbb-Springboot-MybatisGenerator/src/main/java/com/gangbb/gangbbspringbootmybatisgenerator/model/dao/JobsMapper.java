package com.gangbb.gangbbspringbootmybatisgenerator.model.dao;

import com.gangbb.gangbbspringbootmybatisgenerator.model.pojo.Jobs;

public interface JobsMapper {
    int deleteByPrimaryKey(String jobId);

    int insert(Jobs record);

    int insertSelective(Jobs record);

    Jobs selectByPrimaryKey(String jobId);

    int updateByPrimaryKeySelective(Jobs record);

    int updateByPrimaryKey(Jobs record);
}