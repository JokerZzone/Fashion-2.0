package com.lanou.controller;

import com.lanou.entity.Category;
import com.lanou.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by joker on 2017/12/16
 * Param:
 * Function:
 */
@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/catInIndex")
    @ResponseBody
    public List<Category> showCategoryInIndex(){
        return categoryService.categoryShowInNav();
    }

}
