package com.example.testspring.web;

import com.example.testspring.domain.Shop;
import com.example.testspring.domain.Tag;
import com.example.testspring.mapper.TagMapper;
import com.example.testspring.service.ShopService;
import com.example.testspring.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.lang.NullPointerException;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TagController {


    @Autowired
    private TagService tagService;


    @PostMapping("tagwww.do")
    public ModelAndView test2(HttpServletRequest req, HttpServletResponse res,
                              @RequestParam(value="tags_name") String tags_name,
                              @RequestParam(value="productId") int productId
    ) throws Exception
    {
//        Shop paramData = new Shop();
//        paramData.setProductId(productId);

        Tag getTag = new Tag();

        getTag.setTagsName(tags_name);
        getTag.setProductId(productId);

        tagService.insert_tag(getTag); //태그 추가 - 각 해당 id에 맞는값 추가해야함

        ModelAndView mav = new ModelAndView("more_product");

//        List<Shop> moreProduct = shopService.getMore(paramData); //paramData가 id값을 받았고 그 id값에 해당하는 데이터에 접급하기 때문

//        mav.addObject("moreProduct", moreProduct);

        return mav;
    }


}