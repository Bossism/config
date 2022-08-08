package com.example.config.propertyinjection;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

    @Autowired
    private JdbcProperties jdbcProperties;

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());
        return dataSource;
    }
}
