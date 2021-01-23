package com.gangbb.gangbbspringbootmybatis.model.dao;

import com.gangbb.gangbbspringbootmybatis.model.DO.Jobs;
import org.apache.ibatis.annotations.*;

/**
 * @author : Gangbb
 * @ClassName : JobsMapper
 * @Description :
 * @Date : 2021/1/23 10:34
 */
@Mapper
public interface JobsMapper {
    @Insert("insert into jobs(job_id,job_title,min_salary,max_salary) values(#{jobId},#{jobTitle},#{minSalary},#{maxSalary})")
    int add(Jobs job);

    @Update("update jobs set job_title=#{jobTitle} where job_id=#{jobId}")
    int update(Jobs job);

    @Delete("delete from jobs where job_id=#{jobId}")
    int deleteById(String jobId);

    @Select("select * from jobs where job_id=#{jobId}")
    @Results(id = "jobs",value= {
            @Result(property = "jobId", column = "job_id", javaType = String.class),
            @Result(property = "jobTitle", column = "job_title", javaType = String.class),
    })
    Jobs queryJobById(String jobId);
}