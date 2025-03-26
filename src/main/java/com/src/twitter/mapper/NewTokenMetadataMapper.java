package com.src.twitter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.NewTokenMetadata;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface NewTokenMetadataMapper extends BaseMapper<NewTokenMetadata> {
    @Select("select *,total_supply as totalSupply,other_socials " +
            "as otherSocials,dev_balance_sol " +
            "as devBalanceSol,dev_wallet_balance " +
            "as devWalletBalance" +
            ",dev_wallet_history as devWalletHistory" +
            ",launch_timestamp as launchTimestamp" +
            ",last_seen as lastSeen " +
            "from public.new_token_metadata")
    List<NewTokenMetadata> tokenList();
}
