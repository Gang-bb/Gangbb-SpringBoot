package com.gangbb.gangbbspringbootmybatis.controller;


import com.gangbb.gangbbspringbootmybatis.model.DO.Jobs;
import com.gangbb.gangbbspringbootmybatis.model.DO.Locations;
import com.gangbb.gangbbspringbootmybatis.service.JobsService;
import com.gangbb.gangbbspringbootmybatis.service.LocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lyx
 * @ClassName : MybatisController
 * @Description :
 * @Date : 2021/1/22 8:25
 */
@RestController
public class MybatisController {

    @Autowired
    private JobsService jobsService;

    @Autowired
    private LocationsService locationsService;

    @RequestMapping( value = "/job", method = RequestMethod.GET)
    public String jobTest() {
        // 插入
        Jobs job = new Jobs("AA", "TILLE", 200, 300);
        System.out.println("成功插入：" + this.jobsService.add(job) + "数据");
        //查询、修改
        Jobs oldJob = this.jobsService.queryJobById("AA");
        System.out.println("查询结果：" + oldJob);
        oldJob.setJobTitle("NEW TITTLE");
        System.out.println("成功修改：" + this.jobsService.update(oldJob) + "数据");
        //删除
        System.out.println("成功删除：" + this.jobsService.deleteById("AA") + "数据");
        return "test";
    }

    @RequestMapping( value = "/location", method = RequestMethod.GET)
    public String locationTest() {
        // 插入
        Locations location = new Locations(9999, "US", "6666", "LA", "A", "US");
        System.out.println("成功插入：" + this.locationsService.insert(location) + "数据");
        //查询、修改
        Locations oldLocation = this.locationsService.queryLocationById(9999);
        System.out.println("查询结果：" + oldLocation);
        oldLocation.setCity("JP");
        System.out.println("成功修改：" + this.locationsService.update(oldLocation) + "数据");
        //删除
        System.out.println("成功删除：" + this.locationsService.deleteById(9999) + "数据");
        return "test";
    }

}
