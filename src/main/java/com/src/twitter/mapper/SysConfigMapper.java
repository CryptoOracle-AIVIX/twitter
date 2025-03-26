package com.src.twitter.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.src.twitter.entity.SysConfig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SysConfigMapper extends BaseMapper<SysConfig> {

    @Select("SELECT value,variable,set_time AS setTime,set_by as setBy FROM sys.sys_config")
    List<SysConfig> configList();
}
