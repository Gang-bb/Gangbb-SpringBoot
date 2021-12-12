package com.gangbb.springbootmybatis.service.impl;


import com.gangbb.springbootmybatis.model.DO.Jobs;
import com.gangbb.springbootmybatis.model.dao.JobsMapper;
import com.gangbb.springbootmybatis.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : lyx
 * @ClassName : JobsServiceImp
 * @Description :
 * @Date : 2021/1/22 8:36
 */
@Service("JobsService")
public class JobsServiceImp implements JobsService {
    @Autowired
    private JobsMapper jobsMapper;

    @Override
    public int add(Jobs job) {
        return jobsMapper.add(job);
    }

    @Override
    public int update(Jobs job) {
        return jobsMapper.update(job);
    }

    @Override
    public int deleteById(String id) {
        return jobsMapper.deleteById(id);
    }

    @Override
    public Jobs queryJobById(String jobId) {
        return this.jobsMapper.queryJobById(jobId);
    }
}
