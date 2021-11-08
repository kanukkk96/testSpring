package com.example.testspring.web;

import com.example.testspring.domain.Shop;
import com.example.testspring.domain.Tag;
import com.example.testspring.mapper.ShopMapper;
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
public class ShopController {

    @Autowired
    private ShopService shopService;

    @Autowired
    private TagService tagService;

    @GetMapping("shop.do") // 쇼핑리스트 (detail 제외)
    public ModelAndView test(HttpServletRequest req, HttpServletResponse res) throws Exception {
        ModelAndView mav = new ModelAndView("product_list");

        List<Shop> productList = shopService.getShopList();

        mav.addObject("productList", productList);

        return mav;
    }


    @RequestMapping("detail.do") // 쇼핑리스트 (detail 포함 - 각각 제품의 product_id를 이용해 불러냄)
    public ModelAndView test2(HttpServletRequest req, HttpServletResponse res,
                              @RequestParam(value="productId") int productId //requestParam은 productId만 받아옴
//                              @RequestParam(value="tags_id") int tagsId,
//                              @RequestParam(value="tags_name") String tagsName
                              ) throws Exception {
        ModelAndView mav = new ModelAndView("more_product"); // 보여줄 view의 내용
        Shop paramData = new Shop(); //paramData 선언 (Shop과 연관)
//        Tag getTag = new Tag();
        paramData.setProductId(productId); //ip값 받아와야 하니까

//        getTag.setTags_id(tagsId);
//        getTag.setTags_name(tagsName);
//        getTag.setProduct_id(productId);

//        shopService.insert_tag(getTag); //태그 추가 - 각 해당 id에 맞는값 추가해야함

        List<Shop> moreProduct = shopService.getMore(paramData); //paramData가 id값을 받았고 그 id값에 해당하는 데이터에 접급하기 때문

        mav.addObject("moreProduct", moreProduct);

        return mav;
    }

    @GetMapping("save.do") // clothes_review까지 기록해 save
    public ModelAndView test1(HttpServletRequest req, HttpServletResponse res) throws Exception
    {
        ModelAndView mav = new ModelAndView("save_list");

        List<Shop> saveList = shopService.getShopList();

        mav.addObject("saveList", saveList);

        return mav;
    }
    @PostMapping("shop.do")
    public ModelAndView test1(HttpServletRequest req, HttpServletResponse res,
                              @RequestParam(value="clothes") String clothes,
                              @RequestParam(value="color") String color,
                              @RequestParam(value="clothes_size") String clothes_size,
                              @RequestParam(value="clothes_review") String clothes_review) throws Exception
    {
        Shop shop = new Shop(); //shop 생성, -> 받고 싶은 내용들을 set~로 넣어줌
        shop.setClothes(clothes);
        shop.setColor(color);
        shop.setClothesSize(clothes_size);
        shop.setClothesReview(clothes_review);

        shopService.insert_data(shop);
        ModelAndView mav = new ModelAndView("save_list");

        List<Shop> saveList = shopService.getShopList(); //id값 뿐만 아닌 전체를 받기 때문

        mav.addObject("saveList", saveList);

        return mav;
    }
    @PostMapping("tag.do")
    public ModelAndView test2(HttpServletRequest req, HttpServletResponse res,
                              @RequestParam(value="tags_name") String tags_name,
                              @RequestParam(value="productId") int productId
                              ) throws Exception
    {
        Shop paramData = new Shop();
        paramData.setProductId(productId);

        Tag getTag = new Tag();

        getTag.setTagsName(tags_name);
        getTag.setProductId(productId);

        tagService.insert_tag(getTag); //태그 추가 - 각 해당 id에 맞는값 추가해야함

        ModelAndView mav = new ModelAndView("more_product");

        List<Shop> moreProduct = shopService.getMore(paramData); //paramData가 id값을 받았고 그 id값에 해당하는 데이터에 접급하기 때문

        mav.addObject("moreProduct", moreProduct);

        return mav;
    }


}