package com.lanou.dao;

import com.lanou.model.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by joker on 2017/12/16
 * Param:
 * Function:
 */
@Repository
public interface CategoryMapper {

    //根据parentId=0查找出分类
    List<Category> findByParentId(int parentId);

    //根据一级分类的parentId查找二级和三级分类
    List<Category> findByCatId(int catId);
}
