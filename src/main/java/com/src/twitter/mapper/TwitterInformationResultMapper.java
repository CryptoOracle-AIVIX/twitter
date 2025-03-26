package com.src.twitter.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.ChannelAnalysisResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface TwitterInformationResultMapper extends BaseMapper<ChannelAnalysisResult> {


    @Select("SELECT " +
            "dao_name AS daoName, " +
            "date, " +
            "chat_msg_num AS chatMsgNum, " +
            "chat_user_num AS chatUserNum, " +
            "chat_struct_flow_hierarchy AS chatStructFlowHierarchy, " +
            "chat_struct_cent_outdegree AS chatStructCentOutdegree, " +
            "chat_struct_cent_betweenness AS chatStructCentBetweenness, " +
            "chat_struct_cent_outcloseness AS chatStructCentOutcloseness, " +
            "chat_struct_cluster_coeff AS chatStructClusterCoeff, " +
            "chat_struct_transitivity AS chatStructTransitivity, " +
            "chat_user_survivability AS chatUserSurvivability " +
            "FROM discord.channel_analysis_result")
    List<ChannelAnalysisResult> ChannelList();

}
