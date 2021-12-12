package com.gangbb.springbootmybatis.model.dao;

import com.gangbb.springbootmybatis.model.DO.Locations;
import org.springframework.stereotype.Repository;

/**
 * @author : Gangbb
 * @ClassName : LocationsMapper
 * @Description :
 * @Date : 2021/1/23 10:34
 */
@Repository
public interface LocationsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Locations locations);


    Locations selectByPrimaryKey(Integer id);


    int updateByPrimaryKey(Locations record);

}
