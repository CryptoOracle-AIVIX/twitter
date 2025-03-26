package com.src.twitter.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.time.LocalDate;

@Data
@TableName(value = "twitter_data_collection", schema = "twitter")
public class TwitterDataCollection {

    @TableField("author_id")
    private BigDecimal authorId;

    @TableField("author_name")
    private String authorName;

    @TableField("author_followed")
    private BigDecimal authorFollowed;

    @TableField("author_following")
    private BigDecimal authorFollowing;

    @TableId
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField("created_on")
    private Timestamp createdOn;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField("date")
    private Timestamp date;

    @TableField("is_retweet")
    private String isRetweet;

    @TableField("retweeted_tweet")
    private String retweetedTweet;

    @TableField("rich_text")
    private String richText;

    @TableField("text")
    private String text;

    @TableField("tweet_body")
    private String tweetBody;

    @TableField("language")
    private String language;

    @TableField("reply_counts")
    private String replyCounts;

    @TableField("quote_counts")
    private String quoteCounts;

    @TableField("likes")
    private String likes;

    @TableField("views")
    private String views;

    @TableField("retweet_counts")
    private String retweetCounts;

    @TableField("comments")
    private String comments;

    @TableField("is_quoted")
    private String isQuoted;

    @TableField("quoted_tweet")
    private String quotedTweet;

    @TableField("is_reply")
    private String isReply;

    @TableField("is_sensitive")
    private String isSensitive;

    @TableField("replied_to")
    private String repliedTo;

    @TableField("user_mentions")
    private String userMentions;

    @TableField("bookmark_count")
    private String bookmarkCount;

    @TableField("vibe")
    private String vibe;

    @TableField("place")
    private String place;

    @TableField("source")
    private String source;

    @TableField("audio_space_id")
    private String audioSpaceId;

    @TableField("is_space")
    private String isSpace;

    @TableField("voice_info")
    private String voiceInfo;

    @TableField("media")
    private String media;

    @TableField("pool")
    private String pool;

    @TableField("urls")
    private String urls;

    @TableField("has_moderated_replies")
    private String hasModeratedReplies;

    @TableField("hashtags")
    private String hashtags;

    @TableField("symbols")
    private String symbols;

    @TableField("community_note")
    private String communityNote;

    @TableField("community")
    private String community;

    @TableField("url")
    private String url;

    @TableField("edit_control")
    private String editControl;

    @TableField("has_newer_version")
    private String hasNewerVersion;

    @TableField("broadcast")
    private String broadcast;

    @TableField("threads")
    private String threads;

    @TableField("is_liked")
    private String isLiked;

    @TableField("is_retweeted")
    private String isRetweeted;

    @TableField("can_reply")
    private String canReply;

    @TableField("matched_keywords")
    private String matchedKeywords;

    @TableField("rn")
    private Long rn;

}
