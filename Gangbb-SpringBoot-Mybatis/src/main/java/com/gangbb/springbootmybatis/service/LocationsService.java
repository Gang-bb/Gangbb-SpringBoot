package com.gangbb.springbootmybatis.service;


import com.gangbb.springbootmybatis.model.DO.Locations;

/**
 * @author : Gangbb
 * @ClassName : LocationsService
 * @Description :
 * @Date : 2021/1/22 11:22
 */
public interface LocationsService {
    int insert(Locations location);
    int update(Locations location);
    int deleteById(Integer locationId);
    Locations queryLocationById(Integer locationId);
}
