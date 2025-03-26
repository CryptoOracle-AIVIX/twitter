package com.src.twitter.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.src.twitter.entity.TwitterSummarizeCryptoSentiment15Min;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface TwitterSummarizeCryptoSentiment15MinMapper extends BaseMapper<TwitterSummarizeCryptoSentiment15Min> {
    @Select({
            "<script>",
            "SELECT " +
                    "period_start AS periodStart, " +
                    "period_end AS periodEnd, " +
                    "positive_keywords AS positiveKeywords, " +
                    "positive, " +
                    "negative_keywords AS negativeKeywords, " +
                    "negative, " +
                    "name, " +
                    "symbol, " +
                    "slug, " +
                    "recent_proportion AS recentProportion, " +
                    "previous_proportion AS previousProportion, " +
                    "relative_growth AS relativeGrowth " +
                    "FROM twitter.twitter_summarize_crypto_sentiment_15min",
            "<where>",
            "<if test='search != null and search != \"\"'>",
            "AND (",
            "period_start LIKE CONCAT('%', #{search}, '%') ",
            "OR period_end LIKE CONCAT('%', #{search}, '%') ",
            "OR positive_keywords LIKE CONCAT('%', #{search}, '%') ",
            "OR positive LIKE CONCAT('%', #{search}, '%') ",
            "OR negative_keywords LIKE CONCAT('%', #{search}, '%') ",
            "OR negative LIKE CONCAT('%', #{search}, '%') ",
            "OR name LIKE CONCAT('%', #{search}, '%') ",
            "OR symbol LIKE CONCAT('%', #{search}, '%') ",
            "OR slug LIKE CONCAT('%', #{search}, '%') ",
            "OR recent_proportion LIKE CONCAT('%', #{search}, '%') ",
            "OR previous_proportion LIKE CONCAT('%', #{search}, '%') ",
            "OR relative_growth LIKE CONCAT('%', #{search}, '%') ",
            ")",
            "</if>",
            "</where>",
            "LIMIT #{pageSize} OFFSET #{offset}",
            "</script>"
    })
    List<TwitterSummarizeCryptoSentiment15Min> cryptoList(
            @Param("search") String search,
            @Param("offset") int offset,
            @Param("pageSize") int pageSize);
}
