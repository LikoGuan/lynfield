package com.lynfield.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by likoguan on 4/11/17.
 */
@Configuration
@MapperScan("com.lynfield.service.mapper")
public class DataSourceConfiguration {

    @Bean
    @ConfigurationProperties("lynfield.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
