package com.src.twitter.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName(value = "group_messages", schema = "public")
public class GroupMessages {

  @TableField("message_id")
  private Long messageId;

  @TableField("sender_id")
  private Long senderId;

  @TableField("sender_username")
  private String senderUsername;

  @TableField("group_id")
  private Long groupId;

  @TableField("group_username")
  private String groupUsername;

  @TableField("message_text")
  private String messageText;

  @TableField("urls")
  private String urls;

  @TableField("timestamp")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Timestamp timestamp;

  @TableField("message_type")
  private String messageType;

  @TableField("reply_to_msg_id")
  private Long replyToMsgId;

  @TableField("media_type")
  private String mediaType;

  @TableField("mentions")
  private String mentions;

  @TableField("hashtags")
  private String hashtags;

  @TableField("phone_numbers")
  private String phoneNumbers;

  @TableField("emails")
  private String emails;
}
