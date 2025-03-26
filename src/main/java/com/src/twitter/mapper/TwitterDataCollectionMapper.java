package com.src.twitter.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.TwitterDataCollection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TwitterDataCollectionMapper extends BaseMapper<TwitterDataCollection> {
    @Select("SELECT " +
            "id, " +
            "author_id AS authorId, " +
            "author_name AS authorName, " +
            "author_followed AS authorFollowed, " +
            "author_following AS authorFollowing, " +
            "created_on AS createdOn, " +
            "date, " +
            "is_retweet AS isRetweet, " +
            "retweeted_tweet AS retweetedTweet, " +
            "rich_text AS richText, " +
            "text, " +
            "tweet_body AS tweetBody, " +
            "language, " +
            "reply_counts AS replyCounts, " +
            "quote_counts AS quoteCounts, " +
            "likes, " +
            "views, " +
            "retweet_counts AS retweetCounts, " +
            "comments, " +
            "is_quoted AS isQuoted, " +
            "quoted_tweet AS quotedTweet, " +
            "is_reply AS isReply, " +
            "is_sensitive AS isSensitive, " +
            "replied_to AS repliedTo, " +
            "user_mentions AS userMentions, " +
            "bookmark_count AS bookmarkCount, " +
            "vibe, " +
            "place, " +
            "source, " +
            "audio_space_id AS audioSpaceId, " +
            "is_space AS isSpace, " +
            "voice_info AS voiceInfo, " +
            "media, " +
            "pool, " +
            "urls, " +
            "has_moderated_replies AS hasModeratedReplies, " +
            "hashtags, " +
            "symbols, " +
            "community_note AS communityNote, " +
            "community, " +
            "url, " +
            "edit_control AS editControl, " +
            "has_newer_version AS hasNewerVersion, " +
            "broadcast, " +
            "threads, " +
            "is_liked AS isLiked, " +
            "is_retweeted AS isRetweeted, " +
            "can_reply AS canReply, " +
            "matched_keywords AS matchedKeywords, " +
            "rn " +
            "FROM twitter.twitter_data_collection")
    List<TwitterDataCollection> collectionList();

}
