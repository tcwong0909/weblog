package com.tcwong.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.tcwong.demo.dao.mysql"
        ,sqlSessionFactoryRef = "mysqlSqlSessionFactory",sqlSessionTemplateRef = "mysqlSqlSessionTemplate")
public class MysqlMapperConfig {

    @Resource
    private DataSource mysqlDataSource;

    @Primary
    @Bean
    SqlSessionFactory mysqlSqlSessionFactory() {
        SqlSessionFactory sqlSessionFactory = null;
        try {
            SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
            sqlSessionFactoryBean.setDataSource(mysqlDataSource);
            sqlSessionFactoryBean.setTypeAliasesPackage("com.tcwong.demo.bean");
            sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                    .getResource("classpath*:mapper/**/*.xml"));
            sqlSessionFactory = sqlSessionFactoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sqlSessionFactory;
    }

    @Primary
    @Bean
    SqlSessionTemplate mysqlSqlSessionTemplate() {
        return new SqlSessionTemplate(mysqlSqlSessionFactory());
    }
}
