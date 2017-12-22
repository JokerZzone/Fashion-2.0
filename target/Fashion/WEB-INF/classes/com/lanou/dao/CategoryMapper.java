package com.lanou.dao;

import com.lanou.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by joker on 2017/12/16
 * Param:
 * Function:
 */
@Repository
public interface CategoryMapper {

    //根据parentId=0查找出所有一级分类及其所有属性
    public List<Category> findAllByParentId();
}
