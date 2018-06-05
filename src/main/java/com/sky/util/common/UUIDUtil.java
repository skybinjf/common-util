package com.sky.util.common;

import java.util.UUID;

/**
 * 自动生成32位id工具类
 *
 * @author Sky
 * @create 2018-06-05 17:09
 **/
public class UUIDUtil {

    /**
     * 获取32位随机ID
     * @return 32位的随机ID
     */
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString(); //获取UUID并转化为String对象
        uuid = uuid.replace("-", ""); //因为UUID本身为32位只是生成时多了“-”，所以将它们去点就可
        return uuid;
    }

}
