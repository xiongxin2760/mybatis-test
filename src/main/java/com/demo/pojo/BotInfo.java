package com.demo.pojo;

import lombok.Data;

import java.sql.Time;

/**
 * @author xiongxin001
 * @date 11/8/24 2:51 PM
 * @description:
 */
@Data
public class BotInfo {
    Integer id;
    String app_id;
    String collection;
    String collection_sequence;
    Integer bot_id;
    Long timestamp;
    Time create_time;
    Time update_time;
}
