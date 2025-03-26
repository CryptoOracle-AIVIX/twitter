package com.src.twitter.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.ChannelAnalysisResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface TwitterInformationResultMapper extends BaseMapper<ChannelAnalysisResult> {


    @Select("select" +
            " *,dao_name as daoName,chat_msg_num " +
            "as chatMsgNum,chat_user_num " +
            "as chatUserNum,chat_struct_flow_hierarchy " +
            "as chatStructFlowHierarchy,chat_struct_cent_outdegree " +
            "as chatStructCentOutdegree from discord.channel_analysis_result")
    List<ChannelAnalysisResult> ChannelList();
}
