package com.serge.sync.elasticsearch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @version 1.0
 * @since 2017-08-25 17:26:00
 */
@SpringBootApplication
@EnableScheduling
@EnableTransactionManagement
@MapperScan("com.star.sync.elasticsearch.dao")
public class CanalMysqlElasticsearchSyncApplication {
    public static void main(String[] args) {
        SpringApplication.run(CanalMysqlElasticsearchSyncApplication.class, args);
        // http://192.168.2.185:9200/test_info/_search?q=*&pretty 查询所有数据
        // http://192.168.2.185:9200/_cat/indices?v 查询当前es集群中所有的indices
    }
}