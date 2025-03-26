package com.src.twitter.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.TwitterSentimentNew15Min;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface TwitterSentimentNew15MinMapper extends BaseMapper<TwitterSentimentNew15Min> {
    @Select("select * from twitter.twitter_sentiment_new_15min")
    List<TwitterSentimentNew15Min> sentimentList();
}
