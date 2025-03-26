package com.src.twitter.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "twitter_summarize_crypto_sentiment_hourly",schema = "twitter")  // 可以根据需要修改表名
public class TwitterSummarizeCryptoSentimentHourly {

  @TableField("summary_time")
  private String summaryTime;

  @TableField("keywords")
  private String keywords;

  @TableField("positive")
  private String positive;

  @TableField("neutral")
  private String neutral;

  @TableField("negative")
  private String negative;

}
