package com.src.twitter.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.TwitterKolUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface TwitterKolUserInfoMapper extends BaseMapper<TwitterKolUserInfo> {

    @Select("SELECT " +
            "id, " +
            "rest_id AS restId, " +
            "created_at AS createdAt, " +
            "date, " +
            "entities, " +
            "description, " +
            "bio, " +
            "fast_followers_count AS fastFollowersCount, " +
            "favourites_count AS favouritesCount, " +
            "followers_count AS followersCount, " +
            "friends_count AS friendsCount, " +
            "has_custom_timelines AS hasCustomTimelines, " +
            "is_translator AS isTranslator, " +
            "listed_count AS listedCount, " +
            "location, " +
            "media_count AS mediaCount, " +
            "name, " +
            "normal_followers_count AS normalFollowersCount, " +
            "profile_banner_url AS profileBannerUrl, " +
            "profile_image_url_https AS profileImageUrlHttps, " +
            "profile_interstitial_type AS profileInterstitialType, " +
            "`protected` AS protectedField, " + // 由于"protected"是Java关键字，需要用反引号包裹
            "screen_name AS screenName, " +
            "username, " +
            "statuses_count AS statusesCount, " +
            "translator_type AS translatorType, " +
            "verified, " +
            "can_dm AS canDm, " +
            "following, " +
            "community_role AS communityRole, " +
            "notifications_enabled AS notificationsEnabled, " +
            "notifications, " +
            "possibly_sensitive AS possiblySensitive, " +
            "pinned_tweets AS pinnedTweets, " +
            "profile_url AS profileUrl, " +
            "is_blocked AS isBlocked " +
            "FROM twitter.twitter_kol_user_info")
    List<TwitterKolUserInfo> userInfoList();

}
