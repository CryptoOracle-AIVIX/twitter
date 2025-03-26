package com.src.twitter.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.TwitterDataCollection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TwitterDataCollectionMapper extends BaseMapper<TwitterDataCollection> {
    @Select("select * from twitter.twitter_data_collection")
    List<TwitterDataCollection> collectionList();
}
