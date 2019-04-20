package com.serge.sync.elasticsearch.service;

import com.serge.sync.elasticsearch.model.IndexTypeModel;
import com.serge.sync.elasticsearch.model.request.SyncByTableRequest;

/**
 * @version 1.0.0
 * @since 2018-05-21 23:22:00
 */
public interface TransactionalService {

    /**
     * 开启事务的读取mysql并插入到Elasticsearch中（读锁）
     */
    void batchInsertElasticsearch(SyncByTableRequest request, String primaryKey, long from, long to, IndexTypeModel indexTypeModel);
}
