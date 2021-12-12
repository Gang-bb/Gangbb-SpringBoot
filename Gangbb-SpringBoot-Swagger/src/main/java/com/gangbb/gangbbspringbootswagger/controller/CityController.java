package com.gangbb.gangbbspringbootswagger.controller;

import com.gangbb.gangbbspringbootswagger.bean.City;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Gangbb
 * @ClassName : CityController
 * @Description :
 * @Date : 2021/1/24 10:02
 */
@RestController
@Api(value = "CityController")
@RequestMapping("city")
public class CityController {

    @ApiOperation("通过id获取city信息")
    @GetMapping("/{id}")
    public City getCityById(@PathVariable(value = "id") Long id) {
        City city = new City(id, "LA", "a city from US");
        return city;
    }

    @ApiOperation("获取city列表信息")
    @GetMapping("/list")
    public List<City> getCityList() {
        List<City> list = new ArrayList<>();
        City city1 = new City(1L, "LA", "a city from US");
        City city2 = new City(2L, "南宁", "a city from China");
        list.add(city1);
        list.add(city2);
        return list;
    }

    @ApiOperation(value = "新增城市", notes = "根据城市实体创建城市")
    @PostMapping
    public @ResponseBody
    Map<String, Object> addCity(@RequestBody City city) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "success");
        return map;
    }

    @PostMapping("/multi")
    @ApiOperation(value = "添加多个city")
    public List<City> multi(@RequestBody List<City> cities) {
        return cities;
    }

    @PostMapping("/{id}/file")
    @ApiOperation(value = "文件上传")
    public String file(@PathVariable Long id, @RequestParam("file") MultipartFile file) {
        return file.getOriginalFilename();
    }

    @ApiOperation(value = "更新用户", notes = "根据用户id更新用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "城市id", required = true, dataType = "Long", paramType = "path", example = "1"),
            @ApiImplicitParam(name = "city", value = "城市实体", required = true, dataType = "City") })
    @PutMapping("/{id}")
    public @ResponseBody Map<String, Object> updateCity(@PathVariable(value = "id") Long id, @RequestBody City city) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "success");
        return map;
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除city", notes = "删除city")
    public void delete(@PathVariable Integer id) {

    }

}
