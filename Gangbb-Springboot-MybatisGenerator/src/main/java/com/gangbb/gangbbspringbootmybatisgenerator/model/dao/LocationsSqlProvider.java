package com.gangbb.gangbbspringbootmybatisgenerator.model.dao;

import com.gangbb.gangbbspringbootmybatisgenerator.model.pojo.Locations;
import org.apache.ibatis.jdbc.SQL;

public class LocationsSqlProvider {

    public String insertSelective(Locations record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("locations");
        
        if (record.getLocationId() != null) {
            sql.VALUES("location_id", "#{locationId,jdbcType=INTEGER}");
        }
        
        if (record.getStreetAddress() != null) {
            sql.VALUES("street_address", "#{streetAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getPostalCode() != null) {
            sql.VALUES("postal_code", "#{postalCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.VALUES("city", "#{city,jdbcType=VARCHAR}");
        }
        
        if (record.getStateProvince() != null) {
            sql.VALUES("state_province", "#{stateProvince,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryId() != null) {
            sql.VALUES("country_id", "#{countryId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Locations record) {
        SQL sql = new SQL();
        sql.UPDATE("locations");
        
        if (record.getStreetAddress() != null) {
            sql.SET("street_address = #{streetAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getPostalCode() != null) {
            sql.SET("postal_code = #{postalCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.SET("city = #{city,jdbcType=VARCHAR}");
        }
        
        if (record.getStateProvince() != null) {
            sql.SET("state_province = #{stateProvince,jdbcType=VARCHAR}");
        }
        
        if (record.getCountryId() != null) {
            sql.SET("country_id = #{countryId,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("location_id = #{locationId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}