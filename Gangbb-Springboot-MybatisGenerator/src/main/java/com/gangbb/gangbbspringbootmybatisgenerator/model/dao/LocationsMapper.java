package com.gangbb.gangbbspringbootmybatisgenerator.model.dao;

import com.gangbb.gangbbspringbootmybatisgenerator.model.pojo.Locations;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface LocationsMapper {
    @Delete({
        "delete from locations",
        "where location_id = #{locationId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer locationId);

    @Insert({
        "insert into locations (location_id, street_address, ",
        "postal_code, city, ",
        "state_province, country_id)",
        "values (#{locationId,jdbcType=INTEGER}, #{streetAddress,jdbcType=VARCHAR}, ",
        "#{postalCode,jdbcType=VARCHAR}, #{city,jdbcType=VARCHAR}, ",
        "#{stateProvince,jdbcType=VARCHAR}, #{countryId,jdbcType=VARCHAR})"
    })
    int insert(Locations record);

    @InsertProvider(type=LocationsSqlProvider.class, method="insertSelective")
    int insertSelective(Locations record);

    @Select({
        "select",
        "location_id, street_address, postal_code, city, state_province, country_id",
        "from locations",
        "where location_id = #{locationId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="location_id", property="locationId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="street_address", property="streetAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="postal_code", property="postalCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="state_province", property="stateProvince", jdbcType=JdbcType.VARCHAR),
        @Result(column="country_id", property="countryId", jdbcType=JdbcType.VARCHAR)
    })
    Locations selectByPrimaryKey(Integer locationId);

    @UpdateProvider(type=LocationsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Locations record);

    @Update({
        "update locations",
        "set street_address = #{streetAddress,jdbcType=VARCHAR},",
          "postal_code = #{postalCode,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "state_province = #{stateProvince,jdbcType=VARCHAR},",
          "country_id = #{countryId,jdbcType=VARCHAR}",
        "where location_id = #{locationId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Locations record);
}