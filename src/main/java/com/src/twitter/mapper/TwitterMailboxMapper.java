package com.src.twitter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.GroupMessages;
import com.src.twitter.entity.TwitterMailbox;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface TwitterMailboxMapper extends BaseMapper<TwitterMailbox> {


    @Insert("INSERT INTO twitter.twitter_mailbox (id, mailbox, create_date) VALUES (#{id}, #{mailbox}, #{createDate})")
    Boolean mailboxInstall(TwitterMailbox twitterMailbox);
}
