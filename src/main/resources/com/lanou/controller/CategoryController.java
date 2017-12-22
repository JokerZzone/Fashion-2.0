package com.lanou.controller;

import com.lanou.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/cat")
    @ResponseBody
    public List<Object> findFirstCat(@RequestParam("id") int parentId, ModelAndView model){
        if (parentId == 0){
            model.addObject("first",categoryService.findFirstCat(parentId));
            return null;
        }else {
            return categoryService.findSecondAndThirdCat(parentId);
        }
    }


}
