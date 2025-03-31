package com.src.twitter.service;

import com.src.twitter.entity.*;

import java.util.List;

public interface TwitterInformationService {

    List<ChannelAnalysisResult> ChannelList();

    List<ChannelRawData> formationList();

    List<SysConfig> configList();

    List<TwitterKolUserInfo> userInfoList();

    List<TwitterSentimentNew15Min> sentimentList();


    List<TwitterSummarizeCryptoSentimentHourly> hourlyList(String search);

    List<TwitterDataCollection> collectionList();

    List<ChannelUpdates> channelUpdateList();

    List<GroupMessages> groupList();

    List<NewTokenMetadata> tokenList();

    List<TwitterSummarizeCryptoSentiment15Min> cryptoList(String search, int pageNum, int pageSize);

    String countSum();
}
