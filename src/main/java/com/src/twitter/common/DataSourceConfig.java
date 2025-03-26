package com.src.twitter.common;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfig {

    @Bean
    @Primary // 标记 MySQL 为默认数据源
    public DataSource dataSourceMysql() {
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://coracle-mysql.chgc6owgc8vg.ap-southeast-2.rds.amazonaws.com:3306/sys?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC")
                .username("admin")
                .password("1YWTZ0t5wqfqzWzhyQzR")
                .build();
    }

    @Bean
    public DataSource dataSourcePostgresql() {
        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url("jdbc:postgresql://coracle-postgre.chgc6owgc8vg.ap-southeast-2.rds.amazonaws.com:5432/postgres")
                .username("postgres")
                .password("Di1uQQa4eF5TJgird905")
                .build();
    }

    @Bean
    public DataSource dataSource(@Qualifier("dataSourceMysql") DataSource mysqlDataSource,
                                 @Qualifier("dataSourcePostgresql") DataSource postgresqlDataSource) {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put("mysql", mysqlDataSource);
        targetDataSources.put("postgresql", postgresqlDataSource);

        dynamicDataSource.setTargetDataSources(targetDataSources);
        dynamicDataSource.setDefaultTargetDataSource(mysqlDataSource);  // 默认数据源

        return dynamicDataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
