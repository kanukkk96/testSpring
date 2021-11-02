package com.example.testspring.mapper;

import com.example.testspring.domain.Shop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopMapper {

    List<Shop> selectShopping() throws Exception;

}
