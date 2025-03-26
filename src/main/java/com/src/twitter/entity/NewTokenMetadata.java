package com.src.twitter.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName(value = "new_token_metadata", schema = "public")
public class NewTokenMetadata {

  @TableField("address")
  private String address;

  @TableField("name")
  private String name;

  @TableField("symbol")
  private String symbol;

  @TableField("description")
  private String description;

  @TableField("total_supply")
  private String totalSupply;

  @TableField("transactions")
  private Long transactions;

  @TableField("telegram")
  private String telegram;

  @TableField("X")
  private String X;

  @TableField("other_socials")
  private String otherSocials;

  @TableField("mint")
  private String mint;

  @TableField("\"freeze\"")
  private String freeze;

  @TableField("\"update\"")
  private String update;

  @TableField("tax")
  private String tax;

  @TableField("decimals")
  private Long decimals;

  @TableField("dev_balance_sol")
  private String devBalanceSol;

  @TableField("dev_balance_usd")
  private String devBalanceUsd;

  @TableField("dev_wallet_balance")
  private String devWalletBalance;

  @TableField("dev_wallet_history")
  private String devWalletHistory;

  @TableField("\"timestamp\"")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Timestamp timestamp;

  @TableField("launch_timestamp")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Timestamp launchTimestamp;

  @TableField("last_seen")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Timestamp lastSeen;
}
