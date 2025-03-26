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

    @Select("select * from twitter.twitter_kol_user_info")
    List<TwitterKolUserInfo> userInfoList();
}
