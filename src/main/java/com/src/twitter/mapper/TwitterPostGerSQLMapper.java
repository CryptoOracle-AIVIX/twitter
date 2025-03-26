package com.src.twitter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.ChannelUpdates;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface TwitterPostGerSQLMapper extends BaseMapper<ChannelUpdates> {
    @Select("SELECT " +
            "message_id AS messageId, " +
            "sender_id AS senderId, " +
            "sender_username AS senderUsername, " +
            "channel_id AS channelId, " +
            "channel_title AS channelTitle, " +
            "message_text AS messageText, " +
            "urls AS urls, " +
            "timestamp AS timestamp, " +
            "message_type AS messageType, " +
            "reply_to_msg_id AS replyToMsgId, " +
            "media_type AS mediaType, " +
            "mentions AS mentions, " +
            "hashtags AS hashtags, " +
            "phone_numbers AS phoneNumbers, " +
            "emails AS emails, " +
            "is_post AS isPost, " +
            "views_count AS viewsCount, " +
            "forwards_count AS forwardsCount, " +
            "reactions AS reactions, " +
            "comments_count AS commentsCount, " +
            "comments AS comments " +
            "FROM public.channel_updates")
    List<ChannelUpdates> channelUpdateList();

}
