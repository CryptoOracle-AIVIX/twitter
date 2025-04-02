package com.src.twitter.service;

import com.src.twitter.entity.*;
import com.src.twitter.vo.res.TokenListDayRes;

import java.util.List;

public interface TwitterInformationService {

    List<ChannelAnalysisResult> ChannelList();

    List<ChannelRawData> formationList();

    List<SysConfig> configList();

    List<TwitterKolUserInfo> userInfoList();

    List<TwitterSentimentNew15Min> sentimentList(String search, int pageNum, int pageSize);


    List<TwitterSummarizeCryptoSentimentHourly> hourlyList(String search);

    List<TwitterDataCollection> collectionList( int pageNum, int pageSize);

    List<ChannelUpdates> channelUpdateList();

    List<GroupMessages> groupList();

    List<NewTokenMetadata> tokenList();

    List<TwitterSummarizeCryptoSentiment15Min> cryptoList(String search, int pageNum, int pageSize);

    String countSum();

    List<TokenListDayRes> tokenListDay();
}
