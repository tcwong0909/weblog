package com.tcwong.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.annotation.Resource;
import javax.sql.DataSource;

//@Configuration
@MapperScan(basePackages = "com.tcwong.demo.dao.sqlserver"
        ,sqlSessionFactoryRef = "sqlserverSqlSessionFactory", sqlSessionTemplateRef = "sqlserverSqlSessionTemplate")
public class sqlserverMapperConfig {

    @Resource
    private DataSource sqlserverDataSource;

    @Bean
    SqlSessionFactory sqlserverSqlSessionFactory() {
        SqlSessionFactory sqlSessionFactory = null;
        try {
            SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
            sqlSessionFactoryBean.setDataSource(sqlserverDataSource);
            sqlSessionFactoryBean.setTypeAliasesPackage("com.tcwong.demo.bean");
            sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                    .getResource("classpath*:mapper/**/*.xml"));
            sqlSessionFactory = sqlSessionFactoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sqlSessionFactory;
    }

    @Bean
    SqlSessionTemplate sqlserverSqlSessionTemplate() {
        return new SqlSessionTemplate(sqlserverSqlSessionFactory());
    }
}
