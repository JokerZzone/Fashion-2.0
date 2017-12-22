package com.lanou.dao;

import com.lanou.entity.Topic;
import org.springframework.stereotype.Repository;

/**
 * Created by joker on 2017/12/18
 * Param:
 * Function:
 */
@Repository
public interface TopicMapper {

    public Topic findTemplateByTopicId(int topicId);
}
