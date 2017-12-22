package com.lanou.service.impl;

import com.lanou.dao.CategoryMapper;
import com.lanou.model.Category;
import com.lanou.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by joker on 2017/12/16
 * Param:
 * Function:
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryMapper categoryMapper;

    //根据parentId查找分类
    public List<Category> findFirstCat(int parentId) {
        return categoryMapper.findByParentId(parentId);
    }

    public List<Object> findSecondAndThirdCat(int parentId) {
        List<Object> result = new ArrayList<Object>();
        List<Category> second = categoryMapper.findByParentId(parentId);
        for (int i=0; i<second.size(); i++){
            List<Category> third = categoryMapper.findByParentId(second.get(i).getCatId());
            Map<String,Object> tempMap = new HashMap<String, Object>();
            tempMap.put("category",third);
            List<Object> tempList = new ArrayList<Object>();
            tempList.add(second.get(i));
            tempList.add(tempMap);
            result.add(tempList);
        }
        return result;
    }

}
