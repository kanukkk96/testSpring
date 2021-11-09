package com.example.testspring.service;

import com.example.testspring.domain.Shop;
import com.example.testspring.domain.Tag;

import java.util.List;

public interface TagService {

    void insert_tag(Tag getTag) throws Exception;
    List<Tag> selectTag() throws Exception;
}