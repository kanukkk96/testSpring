package com.example.testspring.mapper;

import com.example.testspring.domain.Shop;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShopMapper {

    public List<Shop> selectShopping() throws Exception;

    public List<Shop> more_detail(Shop paramData) throws Exception;

    public void insert_data(Shop shop);

}
