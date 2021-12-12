package com.gangbb.gangbbspringbootswagger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author : Gangbb
 * @ClassName : City
 * @Description :
 * @Date : 2021/1/24 10:08
 */
@ApiModel(value = "City", description = "城市实体类")
public class City {
    @ApiModelProperty("城市id")
    private Long id;
    @ApiModelProperty("城市名")
    private String name;
    @ApiModelProperty("城市描述")
    private String description;

    public City(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
