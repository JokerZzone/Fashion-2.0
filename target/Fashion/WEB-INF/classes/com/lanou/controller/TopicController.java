package com.lanou.controller;

import com.lanou.model.Topic;
import com.lanou.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by joker on 2017/12/18
 * Param:
 * Function:
 */
@Controller
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/template")
    public String showTemplate(HttpServletRequest request){
        Topic topic = topicService.getTemplate(3);
        String[] templates = topic.getTemplate().split("#");
        request.setAttribute("templates", templates);
        request.setAttribute("html", topic.getHtml());
        return "index";
    }

}
