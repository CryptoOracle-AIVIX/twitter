package com.src.twitter.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.security.Timestamp;
import java.time.LocalDate;

@Data
@TableName(value = "sys_config", schema = "sys")
public class SysConfig {

    @TableField("variable")
    private String variable;

    @TableField("value")
    private String value;

    @TableField("set_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp setTime;

    @TableField("set_by")
    private String setBy;



}
