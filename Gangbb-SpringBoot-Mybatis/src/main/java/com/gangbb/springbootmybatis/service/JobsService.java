package com.gangbb.springbootmybatis.service;


import com.gangbb.springbootmybatis.model.DO.Jobs;

/**
 * @author : lyx
 * @ClassName : JobsService
 * @Description :
 * @Date : 2021/1/22 8:34
 */

public interface JobsService {
    int add(Jobs job);
    int update(Jobs job);
    int deleteById(String jobId);
    Jobs queryJobById(String jobId);
}
