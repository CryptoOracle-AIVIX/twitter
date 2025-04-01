package com.src.twitter.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.ChannelAnalysisResult;
import com.src.twitter.vo.res.TokenListDayRes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface TwitterInformationResultMapper extends BaseMapper<ChannelAnalysisResult> {


    @Select("select count(*) from twitter.twitter_data_collection")
    String countSum();

    @Select("SELECT " +
            "c.dao_name AS daoName, " +
            "(SELECT SUM(chat_user_num) FROM discord.channel_analysis_result) AS TotalHolders, " +
            "(SELECT SUM(chat_msg_num) FROM discord.channel_analysis_result) AS TotalTreasury, " +
            "c.date, " +
            "c.chat_msg_num AS chatMsgNum, " +
            "c.chat_user_num AS chatUserNum, " +
            "c.chat_struct_flow_hierarchy AS chatStructFlowHierarchy, " +
            "c.chat_struct_cent_outdegree AS chatStructCentOutdegree, " +
            "c.chat_struct_cent_betweenness AS chatStructCentBetweenness, " +
            "c.chat_struct_cent_outcloseness AS chatStructCentOutcloseness, " +
            "c.chat_struct_cluster_coeff AS chatStructClusterCoeff, " +
            "c.chat_struct_transitivity AS chatStructTransitivity, " +
            "c.chat_user_survivability AS chatUserSurvivability " +
            "FROM discord.channel_analysis_result c ")
    List<ChannelAnalysisResult> ChannelList();


    @Select("select count(*) as discussant,sum(chat_user_num) as voter,sum(chat_msg_num) as chatter,date  FROM discord.channel_analysis_result group by date")
    List<TokenListDayRes> tokenListDay();
}
