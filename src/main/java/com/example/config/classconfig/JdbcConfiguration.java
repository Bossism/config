package com.example.config.classconfig;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 *   java 配置
 */
@Configuration    // 声明配置类
@PropertySource("classpath:jdbc.properties")   // 指定属性文件的路径
public class JdbcConfiguration {

//    @Value("${jdbc.url}")     // 为属性注入值
//    private String url;
//
//    @Value("${jdbc.driverClassName}")
//    private String driverClassName;
//
//    @Value("${jdbc.username}")
//    private String username;
//
//    @Value("${jdbc.password}")
//    private String password;

    // 通过@Bean将 dataSource()方法声明为一个注册Bean的方法，Spring会自动调用该方法，将方法的返回值加入Spring容器中
//    @Bean
//    public DataSource dataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl(url);
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }


}
