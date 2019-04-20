package com.serge.sync.elasticsearch.service;

import com.serge.sync.elasticsearch.model.request.SyncByTableRequest;

/**
 * @version 1.0
 * @since 2017-08-31 17:48:00
 */
public interface SyncService {
    /**
     * 通过database和table同步数据库
     *
     * @param request 请求参数
     * @return 后台同步进程执行成功与否
     */
    boolean syncByTable(SyncByTableRequest request);
}