package com.src.twitter.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName(value = "channel_analysis_result", schema = "discord")
public class ChannelAnalysisResult implements Serializable {



    @TableField("dao_name")
    private String daoName;

    @TableField("date")
    private String date;

    @TableField("chat_msg_num")
    private Long chatMsgNum;

    @TableField("chat_user_num")
    private Long chatUserNum;


    @TableField("chat_struct_flow_hierarchy")
    private BigDecimal chatStructFlowHierarchy;

    @TableField("chat_struct_cent_outdegree")
    private BigDecimal chatStructCentOutdegree;


    @TableField("chat_struct_cent_betweenness")
    private BigDecimal chatStructCentBetweenness;


    @TableField("chat_struct_cent_outcloseness")
    private BigDecimal chatStructCentOutcloseness;


    @TableField("chat_struct_cluster_coeff")
    private BigDecimal chatStructClusterCoeff;


    @TableField("chat_struct_transitivity")
    private BigDecimal chatStructTransitivity;


    @TableField("chat_user_survivability")
    private BigDecimal chatUserSurvivability;


    private Long TotalTreasury;
    private Long TotalHolders;

}
