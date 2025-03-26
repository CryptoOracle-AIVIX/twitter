package com.src.twitter.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName(value = "twitter_summarize_crypto_sentiment_15min",schema = "twitter")  // 可以根据需要修改表名
public class TwitterSummarizeCryptoSentiment15Min {

  @TableField("period_start")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Timestamp periodStart;

  @TableField("period_end")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Timestamp periodEnd;

  @TableField("name")
  private String name;

  @TableField("symbol")
  private String symbol;

  @TableField("slug")
  private String slug;

  @TableField("recent_proportion")
  private String recentProportion;

  @TableField("previous_proportion")
  private String previousProportion;

  @TableField("relative_growth")
  private String relativeGrowth;

  @TableField("positive")
  private String positive;

  @TableField("positive_keywords")
  private String positiveKeywords;

  @TableField("negative")
  private String negative;

  @TableField("negative_keywords")
  private String negativeKeywords;

}
