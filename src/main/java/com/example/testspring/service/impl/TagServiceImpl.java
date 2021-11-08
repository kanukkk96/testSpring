package com.example.testspring.service.impl;

import com.example.testspring.domain.Tag;
import com.example.testspring.mapper.TagMapper;
import com.example.testspring.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;


    @Override
    public void insert_tag(Tag getTag) throws Exception {
        tagMapper.insert_tag(getTag);
    }


}