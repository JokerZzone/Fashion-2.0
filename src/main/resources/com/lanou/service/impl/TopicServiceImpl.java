package com.lanou.service.impl;

import com.lanou.dao.TopicMapper;
import com.lanou.model.Topic;
import com.lanou.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by joker on 2017/12/18
 * Param:
 * Function:
 */
@Service("topicService")
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicMapper topicMapper;

    public Topic getTemplate(int topicId) {

        return topicMapper.findTemplateByTopicId(topicId);
    }
}
