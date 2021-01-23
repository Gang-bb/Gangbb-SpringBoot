package com.gangbb.gangbbspringbootmybatis.service.impl;


import com.gangbb.gangbbspringbootmybatis.model.DO.Locations;
import com.gangbb.gangbbspringbootmybatis.model.dao.LocationsMapper;
import com.gangbb.gangbbspringbootmybatis.service.LocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Gangbb
 * @ClassName : LocationsServiceImp
 * @Description :
 * @Date : 2021/1/22 11:22
 */
@Service("LocationsService")
public class LocationsServiceImp implements LocationsService {

    @Autowired
    private LocationsMapper locationsMapper;

    @Override
    public int insert(Locations location) {
        return locationsMapper.insert(location);
    }

    @Override
    public int update(Locations location) {
        return locationsMapper.updateByPrimaryKey(location);
    }

    @Override
    public int deleteById(Integer locationId) {
        return locationsMapper.deleteByPrimaryKey(locationId);
    }

    @Override
    public Locations queryLocationById(Integer locationId) {
        return locationsMapper.selectByPrimaryKey(locationId);
    }
}
