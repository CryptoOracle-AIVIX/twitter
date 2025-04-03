package com.src.twitter.service.Impl;



import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.src.twitter.common.DataSourceContextHolder;
import com.src.twitter.entity.*;
import com.src.twitter.mapper.*;
import com.src.twitter.service.TwitterInformationService;
import com.src.twitter.vo.res.TokenListDayRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class TwitterInformationServiceImpl implements TwitterInformationService {

    @Autowired
    SysConfigMapper sysConfigMapper;

    @Autowired
    TwitterMailboxMapper twitterMailboxMapper;

    @Autowired
    TwitterPostGerSQLMapper twitterPostGerSQLMapper;

    @Autowired
    NewTokenMetadataMapper newTokenMetadataMapper;

    @Autowired
    GroupMessagesMapper groupMessagesMapper;

    @Autowired
    TwitterDataCollectionMapper twitterDataCollectionMapper;

    @Autowired
    TwitterKolUserInfoMapper twitterKolUserInfo;
    @Autowired
    TwitterSentimentNew15MinMapper twitterSentimentNew15Min;
    @Autowired
    TwitterSummarizeCryptoSentiment15MinMapper twitterSummarizeCryptoSentiment15Min;
    @Autowired
    TwitterSummarizeCryptoSentimentHourlyMapper twitterSummarizeCryptoSentimentHourly;

    @Autowired
    TwitterInformationMapper twitterInformationMapper;

    @Autowired
    TwitterInformationResultMapper twitterInformationResultMapper;


    @Override
    public List<ChannelAnalysisResult> ChannelList() {
        return twitterInformationResultMapper.ChannelList();
    }

    @Override
    public List<ChannelRawData> formationList() {
        return twitterInformationMapper.formationList();
    }

    @Override
    public List<SysConfig> configList() {
        return sysConfigMapper.configList();
    }

    @Override
    public List<TwitterKolUserInfo> userInfoList() {
        return twitterKolUserInfo.userInfoList();
    }

    @Override
    public List<TwitterSentimentNew15Min> sentimentList(String search, int pageNum, int pageSize) {
        // 计算分页偏移量
        int offset = (pageNum - 1) * pageSize;
        return twitterSentimentNew15Min.sentimentList(search,offset,pageSize);
    }

    @Override
    //每小时新闻摘要
    public List<TwitterSummarizeCryptoSentimentHourly> hourlyList(String search) {
        return twitterSummarizeCryptoSentimentHourly.hourlyList(search);
    }

    @Override
    public List<TwitterDataCollection> collectionList( int pageNum, int pageSize) {
        // 计算分页偏移量
        int offset = (pageNum - 1) * pageSize;
        return twitterDataCollectionMapper.collectionList(offset,pageSize);
    }

    @Override
    public List<ChannelUpdates> channelUpdateList() {
        DataSourceContextHolder.setDataSourceType("postgresql");
        return twitterPostGerSQLMapper.channelUpdateList();
    }

    @Override
    public List<GroupMessages> groupList() {
        DataSourceContextHolder.setDataSourceType("postgresql");
        return groupMessagesMapper.groupList();
    }

    @Override
    public List<NewTokenMetadata> tokenList() {
        System.out.println("Mapper 是否为空：" + (newTokenMetadataMapper == null));
        DataSourceContextHolder.setDataSourceType("postgresql");
        return newTokenMetadataMapper.tokenList();
    }

    @Override
    public List<TwitterSummarizeCryptoSentiment15Min> cryptoList(String search, int pageNum, int pageSize) {
        // 计算分页偏移量
        int offset = (pageNum - 1) * pageSize;
        return twitterSummarizeCryptoSentiment15Min.cryptoList(search,offset,pageSize);
    }

    @Override
    public String countSum() {
        return twitterInformationResultMapper.countSum();
    }

    @Override
    public List<TokenListDayRes> tokenListDay() {
        return twitterInformationResultMapper.tokenListDay();
    }

    @Override
    public Boolean mailboxInstall(TwitterMailbox twitterMailbox) {
        twitterMailbox.setId(UUID.randomUUID().toString());
        twitterMailbox.setCreateDate(new Timestamp(System.currentTimeMillis()));
        return twitterMailboxMapper.mailboxInstall(twitterMailbox);
    }
}
