package com.lanou.service;

import com.lanou.model.Category;

import java.util.List;

/**
 * Created by joker on 2017/12/16
 * Param:
 * Function:
 */
public interface CategoryService {

    //根据parentId查找一级分类
    List<Category> findFirstCat(int parentId);

    //根据parentId查找二级和三级分类
    List<Object> findSecondAndThirdCat(int parentId);

}
