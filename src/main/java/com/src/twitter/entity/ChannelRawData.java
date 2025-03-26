package com.src.twitter.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName(value = "channel_raw_data", schema = "discord")
public class ChannelRawData {

    @TableField("dao_name")
    private String daoName;

    @TableField("channel_id")
    private String channelId;

    @TableField("message_id")
    private String messageId;

    @TableField("author_id")
    private String authorId;

    @TableField("author_name")
    private String authorName;

    @TableField("isBot")
    private String isBot;

    @TableField("content")
    private String content;

    @TableField("attachments")
    private String attachments;

    @TableField("reactions")
    private String reactions;

    @TableField("message_type")
    private String messageType;

    @TableField("timestamp")
    private String timestamp;

    @TableField("mentions_id")
    private String mentionsId;

    @TableField("reference_message_id")
    private String referenceMessageId;

    @TableField("reference_channel_id")
    private String referenceChannelId;

}
