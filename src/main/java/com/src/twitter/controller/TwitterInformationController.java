package com.src.twitter.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.src.twitter.entity.*;
import com.src.twitter.service.TwitterInformationService;
import com.src.twitter.vo.res.TokenListDayRes;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 推特
 */
@RestController
@RequestMapping("/twitter")
@Tag(name = "twitter API", description = "管理 twitter 信息的接口")
public class TwitterInformationController {


    @Autowired
    TwitterInformationService twitterInformationService;

    @GetMapping("/count/sum")
    @Operation(summary = "首页展示条数", description = "查看twitter所有数据的总和")
    public ResponseEntity<String> countSum(){
        return ResponseEntity.ok(twitterInformationService.countSum());
    }

    @GetMapping("/result/list")
    public ResponseEntity<List<ChannelAnalysisResult>> ChannelList(){
        return ResponseEntity.ok(twitterInformationService.ChannelList());
    }

    @GetMapping("/formation/list")
    public ResponseEntity<List<ChannelRawData>> formationList(){
        return ResponseEntity.ok(twitterInformationService.formationList());
    }

    @GetMapping("/config/list")
    public ResponseEntity<List<SysConfig>> configList(){
        return ResponseEntity.ok(twitterInformationService.configList());
    }

    @GetMapping("/userInfo/list")
    public ResponseEntity<List<TwitterKolUserInfo>> userInfoList(){
        return ResponseEntity.ok(twitterInformationService.userInfoList());
    }

    @GetMapping("/sentiment/list")
    public ResponseEntity<List<TwitterSentimentNew15Min>> sentimentList(@RequestParam(value = "search",required = false) String search){
        return ResponseEntity.ok(twitterInformationService.sentimentList(search));
    }

    @GetMapping("/collection/list")
    public ResponseEntity<List<TwitterDataCollection>> collectionList(){
        return ResponseEntity.ok(twitterInformationService.collectionList());
    }

    @GetMapping("/crypto/list")
    @Operation(summary = "十五分钟内生长内容总结", description = "查询数据库中的十五分钟内的信息")
    public ResponseEntity<List<TwitterSummarizeCryptoSentiment15Min>> cryptoList(@RequestParam(value = "search", required = false) String search,
                                                                                 @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                                                                                 @RequestParam(value = "pageSize", defaultValue = "10") int pageSize){
        return ResponseEntity.ok(twitterInformationService.cryptoList(search,pageNum,pageSize));
    }

    @GetMapping("/hourly/list")
    //没小时新闻摘要
    @Operation(summary = "每小时总结的新闻", description = "查询数据库中的小时内的信息")
    public ResponseEntity<List<TwitterSummarizeCryptoSentimentHourly>> hourlyList(@RequestParam(value = "search",required = false) String search){
        return ResponseEntity.ok(twitterInformationService.hourlyList(search));
    }

    @GetMapping("/channel/list")
    public ResponseEntity<List<ChannelUpdates>> channelUpdateList(){
        return ResponseEntity.ok(twitterInformationService.channelUpdateList());
    }

    @GetMapping("/group/list")
    public ResponseEntity<List<GroupMessages>> groupList(){
        return ResponseEntity.ok(twitterInformationService.groupList());
    }

    @GetMapping("/token/list")
    public ResponseEntity<List<NewTokenMetadata>> tokenList(){
        return ResponseEntity.ok(twitterInformationService.tokenList());
    }

    @GetMapping("/result/list/day")
    public ResponseEntity<List<TokenListDayRes>> tokenListDay(){
        return ResponseEntity.ok(twitterInformationService.tokenListDay());
    }

}


