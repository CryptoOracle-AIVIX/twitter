package com.src.twitter.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.security.Timestamp;
import java.time.LocalDate;

@Data
@TableName(value = "twitter_sentiment_new_15min",schema = "twitter")  // 可以根据需要修改表名
public class TwitterSentimentNew15Min {

  @TableField("date")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Timestamp date;

  @TableField("name")
  private String name;

  @TableField("symbol")
  private String symbol;

  @TableField("slug")
  private String slug;

  @TableField("negative")
  private Long negative;

  @TableField("neutral")
  private Long neutral;

  @TableField("positive")
  private Long positive;

  @TableField("total")
  private Long total;

}
