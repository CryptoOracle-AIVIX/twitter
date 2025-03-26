package com.src.twitter.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.ChannelRawData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface TwitterInformationMapper extends BaseMapper<ChannelRawData> {
    @Select("select message_type as messageType,timestamp,isBot,content from ")
    List<ChannelRawData> formationList();
}
