package com.src.twitter.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.TwitterSentimentNew15Min;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface TwitterSentimentNew15MinMapper extends BaseMapper<TwitterSentimentNew15Min> {

    @Select({
            "<script>",
            "SELECT * FROM twitter.twitter_sentiment_new_15min",
            "<where>",
            "<if test='search != null and search != \"\"'>",
            "AND (",
            "date LIKE CONCAT('%', #{search}, '%') ",
            "OR name LIKE CONCAT('%', #{search}, '%') ",
            "OR symbol LIKE CONCAT('%', #{search}, '%') ",
            "OR slug LIKE CONCAT('%', #{search}, '%') ",
            "OR negative LIKE CONCAT('%', #{search}, '%') ",
            "OR neutral LIKE CONCAT('%', #{search}, '%') ",
            "OR positive LIKE CONCAT('%', #{search}, '%') ",
            "OR total LIKE CONCAT('%', #{search}, '%') ",
            ")",
            "</if>",
            "</where>",
            "LIMIT #{pageSize} OFFSET #{offset}",
            "</script>"
    })
    List<TwitterSentimentNew15Min> sentimentList(@Param("search") String search, @Param("offset") int offset, @Param("pageSize") int pageSize);
}
