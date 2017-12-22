package com.lanou.service.impl;

import com.lanou.dao.CategoryMapper;
import com.lanou.entity.Category;
import com.lanou.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by joker on 2017/12/16
 * Param:
 * Function:
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> categoryShowInNav() {
        return categoryMapper.findAllByParentId();
    }
}
