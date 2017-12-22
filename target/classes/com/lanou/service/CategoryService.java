package com.lanou.service;

import com.lanou.entity.Category;

import java.util.List;

/**
 * Created by joker on 2017/12/16
 * Param:
 * Function:
 */
public interface CategoryService {

    //实现首页加载时的分类展示
    public List<Category> categoryShowInNav();
}
