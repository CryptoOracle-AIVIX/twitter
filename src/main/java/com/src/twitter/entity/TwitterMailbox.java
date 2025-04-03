package com.src.twitter.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;


@Data
@TableName(value = "twitter_mailbox",schema = "twitter") // 可以根据需要修改表名
public class TwitterMailbox {

    @TableId
    private String id;

    @TableField("mailbox")
    private String mailbox;

    @TableField("create_date")
    private Timestamp createDate;
}
