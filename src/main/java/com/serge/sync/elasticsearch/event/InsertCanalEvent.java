package com.serge.sync.elasticsearch.event;

import com.alibaba.otter.canal.protocol.CanalEntry.Entry;

/**
 * @version 1.0
 * @since 2017-08-26 22:30:00
 */
public class InsertCanalEvent extends CanalEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public InsertCanalEvent(Entry source) {
        super(source);
    }
}
