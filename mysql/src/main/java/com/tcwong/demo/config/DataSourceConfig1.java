package com.tcwong.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig1 {

    @Value("${spring.datasource.mysql.username}")
    private String mysqlUserName;
    @Value("${spring.datasource.mysql.password}")
    private String mysqlPassword;
    @Value("${spring.datasource.mysql.url}")
    private String mysqlUrl;
    @Value("${spring.datasource.mysql.driver-class-name}")
    private String mysqlDriverClass;

    @Value("${spring.datasource.sqlserver.username}")
    private String sqlserverPassword;
    @Value("${spring.datasource.sqlserver.password}")
    private String sqlserverUserName;
    @Value("${spring.datasource.sqlserver.url}")
    private String sqlserverUrl;
    @Value("${spring.datasource.sqlserver.driver-class-name}")
    private String sqlserverDriverClass;

    @Primary
    @Bean
    public DataSource mysqlDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(mysqlUserName);
        druidDataSource.setPassword(mysqlPassword);
        druidDataSource.setUrl(mysqlUrl);
        druidDataSource.setDriverClassName(mysqlDriverClass);
        return druidDataSource;
    }

    @Bean
    public DataSource sqlserverDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(sqlserverUserName);
        druidDataSource.setPassword(sqlserverPassword);
        druidDataSource.setUrl(sqlserverUrl);
        druidDataSource.setDriverClassName(sqlserverDriverClass);
        return druidDataSource;
    }

}
