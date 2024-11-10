package com.demo;

import com.demo.mapper.BotInfoMapper;
import com.demo.pojo.BotInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiongxin001
 * @date 11/8/24 3:10 PM
 * @description:
 */
public class MybatisMapperDemo {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        BotInfoMapper mapper = sqlSession.getMapper(BotInfoMapper.class);
//        BotInfo info = mapper.botInfoById(1);
//        List<BotInfo> info = mapper.selectByCondition("wenda_069c7ab08b88989ab4d99e8c7bd18976", 2075);
        Map map = new HashMap<>();
        map.put("botId", 2075);
        List<BotInfo> info = mapper.selectByConditionSingle(map);
        System.out.println(info);

        sqlSession.close();
    }
}
