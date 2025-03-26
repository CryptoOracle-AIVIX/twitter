package com.src.twitter.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.time.LocalDate;

@Data
@TableName(value = "twitter_kol_user_info",schema = "twitter") // 可以根据需要修改表名
public class TwitterKolUserInfo {

  @TableId
  private Long id;

  @TableField("rest_id")
  private Long restId;

  @TableField("created_at")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Timestamp createdAt;

  @TableField("date")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Timestamp date;

  @TableField("entities")
  private String entities;

  @TableField("description")
  private String description;

  @TableField("bio")
  private String bio;

  @TableField("fast_followers_count")
  private Long fastFollowersCount;

  @TableField("favourites_count")
  private Long favouritesCount;

  @TableField("followers_count")
  private Long followersCount;

  @TableField("friends_count")
  private Long friendsCount;

  @TableField("has_custom_timelines")
  private Long hasCustomTimelines;

  @TableField("is_translator")
  private Long isTranslator;

  @TableField("listed_count")
  private Long listedCount;

  @TableField("location")
  private String location;

  @TableField("media_count")
  private Long mediaCount;

  @TableField("name")
  private String name;

  @TableField("normal_followers_count")
  private Long normalFollowersCount;

  @TableField("profile_banner_url")
  private String profileBannerUrl;

  @TableField("profile_image_url_https")
  private String profileImageUrlHttps;

  @TableField("profile_interstitial_type")
  private String profileInterstitialType;

  @TableField("protected")
  private Long protectedField;  // 由于"protected"是Java的关键字，需要改名

  @TableField("screen_name")
  private String screenName;

  @TableField("username")
  private String username;

  @TableField("statuses_count")
  private Long statusesCount;

  @TableField("translator_type")
  private String translatorType;

  @TableField("verified")
  private Long verified;

  @TableField("can_dm")
  private Long canDm;

  @TableField("following")
  private Long following;

  @TableField("community_role")
  private BigDecimal communityRole;

  @TableField("notifications_enabled")
  private Long notificationsEnabled;

  @TableField("notifications")
  private Long notifications;

  @TableField("possibly_sensitive")
  private Long possiblySensitive;

  @TableField("pinned_tweets")
  private String pinnedTweets;

  @TableField("profile_url")
  private String profileUrl;

  @TableField("is_blocked")
  private Long isBlocked;

}
