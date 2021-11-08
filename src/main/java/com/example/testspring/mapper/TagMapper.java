package com.example.testspring.mapper;

import com.example.testspring.domain.Tag;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface TagMapper {

    public void insert_tag(Tag getTag);

}
