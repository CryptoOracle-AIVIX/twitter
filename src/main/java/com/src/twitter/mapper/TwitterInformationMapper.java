package com.src.twitter.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.ChannelRawData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface TwitterInformationMapper extends BaseMapper<ChannelRawData> {
    @Select("SELECT " +
            "dao_name AS daoName, " +
            "channel_id AS channelId, " +
            "message_id AS messageId, " +
            "author_id AS authorId, " +
            "author_name AS authorName, " +
            "isBot, " +
            "content, " +
            "attachments, " +
            "reactions, " +
            "message_type AS messageType, " +
            "timestamp, " +
            "mentions_id AS mentionsId, " +
            "reference_message_id AS referenceMessageId, " +
            "reference_channel_id AS referenceChannelId " +
            "FROM discord.channel_raw_data")
    List<ChannelRawData> formationList();
}
