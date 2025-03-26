package com.src.twitter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.ChannelUpdates;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface TwitterPostGerSQLMapper extends BaseMapper<ChannelUpdates> {
    @Select("select * from public.channel_updates")
    List<ChannelUpdates> channelUpdateList();
}
