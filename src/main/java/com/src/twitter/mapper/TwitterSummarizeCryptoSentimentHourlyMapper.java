package com.src.twitter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.TwitterSummarizeCryptoSentimentHourly;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface TwitterSummarizeCryptoSentimentHourlyMapper extends BaseMapper<TwitterSummarizeCryptoSentimentHourly> {
    @Select("<script>" +
            "SELECT *, summary_time as summaryTime " +
            "FROM twitter.twitter_summarize_crypto_sentiment_hourly " +
            "WHERE 1=1 " +  // 避免 WHERE 关键字单独存在
            "<if test='search != null and search.trim() != \"\"'>" +
            "AND (" +
            "summary_time LIKE CONCAT('%', #{search}, '%') " +
            "OR keywords LIKE CONCAT('%', #{search}, '%') " +
            "OR positive LIKE CONCAT('%', #{search}, '%') " +
            "OR neutral LIKE CONCAT('%', #{search}, '%') " +
            "OR negative LIKE CONCAT('%', #{search}, '%'))" +
            "</if>" +
            "</script>")
    List<TwitterSummarizeCryptoSentimentHourly> hourlyList(@Param("search") String search);


}
