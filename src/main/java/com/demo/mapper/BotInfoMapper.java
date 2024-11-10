package com.demo.mapper;

import com.demo.pojo.BotInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author xiongxin001
 * @date 11/9/24 3:41 PM
 * @description:
 */
public interface BotInfoMapper {
    BotInfo botInfoById(Integer id);
    List<BotInfo> selectByCondition(@Param("appId") String appId, @Param("botId") Integer botId);
    List<BotInfo> selectByConditionSingle(Map map);
}
