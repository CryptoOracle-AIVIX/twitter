package com.src.twitter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.GroupMessages;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface GroupMessagesMapper extends BaseMapper<GroupMessages> {

    @Select("select * from public.group_messages")
    List<GroupMessages> groupList();
}
