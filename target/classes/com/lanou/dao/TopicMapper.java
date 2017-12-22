package com.lanou.dao;

import com.lanou.model.Topic;
import org.springframework.stereotype.Repository;

/**
 * Created by joker on 2017/12/18
 * Param:
 * Function:
 */
@Repository
public interface TopicMapper {

    Topic findTemplateByTopicId(int topicId);
}
