package com.lanou.entity;

import java.io.Serializable;

/**
 * Created by joker on 2017/12/16
 * Param:
 * Function:
 */
public class Category implements Serializable{
    private int catId;
    private int parentId;
    private String catName;
    private String catDesc;
    private String style;
    private int sortOrder;
    private int showInNav;
    private int isShow;

    public Category() {
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public int getShowInNav() {
        return showInNav;
    }

    public void setShowInNav(int showInNav) {
        this.showInNav = showInNav;
    }

    public int getIsShow() {
        return isShow;
    }

    public void setIsShow(int isShow) {
        this.isShow = isShow;
    }
}
