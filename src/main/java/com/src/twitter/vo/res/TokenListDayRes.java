package com.src.twitter.vo.res;

import lombok.Data;

@Data
public class TokenListDayRes {

    /**
     * 投票用户
     */
    private String voter;

    /**
     * 聊天用户
     */
    private String chatter;

    /**
     * 参与讨论者
     */
    private String discussant;

    /**
     * 时间
     */
    private String date;
}
