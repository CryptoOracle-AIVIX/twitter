package com.src.twitter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.GroupMessages;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface GroupMessagesMapper extends BaseMapper<GroupMessages> {

    @Select("SELECT " +
            "message_id AS messageId, " +
            "sender_id AS senderId, " +
            "sender_username AS senderUsername, " +
            "group_id AS groupId, " +
            "group_username AS groupUsername, " +
            "message_text AS messageText, " +
            "urls AS urls, " +
            "timestamp AS timestamp, " +
            "message_type AS messageType, " +
            "reply_to_msg_id AS replyToMsgId, " +
            "media_type AS mediaType, " +
            "mentions AS mentions, " +
            "hashtags AS hashtags, " +
            "phone_numbers AS phoneNumbers, " +
            "emails AS emails " +
            "FROM public.group_messages")
    List<GroupMessages> groupList();
}
