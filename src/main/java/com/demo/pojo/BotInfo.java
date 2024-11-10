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
    String appId;
    String collection;
    String collectionSequence;
    Integer botId;
    Long timestamp;
    Time createTime;
    Time updateTime;
}
