package com.lanou.entity;

import java.io.Serializable;

/**
 * Created by joker on 2017/12/18
 * Param:
 * Function:
 */
public class Topic implements Serializable {
    private int topicId;
    private String topicName;
    private String template;
    private String html;
    private String css;

    public Topic(String topicName, String template, String css) {
        this.topicName = topicName;
        this.template = template;
        this.css = css;
    }

    public Topic() {
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }
}
