package com.boot.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Gson是线程安全的 可以考虑整个应用只创建一个gson 单例对象
 * 
 * @author zhangxiong
 * @date 2017/6/16.
 */
public class JsonUtil {

    private static Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    private static class Holder {
        static Gson gson = new GsonBuilder().create();
    }

    private static Gson getInstance() {
        return Holder.gson;
    }

    /**
     * 简单的将对象转成json字符串 如果有某些不需要转换的字段，请参考gson文档使用
     * 
     * @param object
     * @return
     */
    public static String toJsonString(Object object) {
        long start = System.currentTimeMillis();
        String json = getInstance().toJson(object);
        logger.info("转成json结果 json = {}, 耗时 costs = {} ms", json, System.currentTimeMillis() - start);
        return json;
    }

    /**
     * 将json字符串转化成对象
     * 
     * @return
     */
    public static <T> T toObject(String json, Class<T> tClass) {
        long start = System.currentTimeMillis();
        T result = getInstance().fromJson(json, tClass);
        logger.info("转成对象结果 json = {}, 耗时 costs = {} ms", json, System.currentTimeMillis() - start);
        return result;
    }

    /**
     * 专门用来打印含有时间字段的日志 时间显示格式 yyyy-MM-dd HH:mm:ss todo 有bug 待查明
     * 
     * @param object
     * @return
     */
    private static String toJsonLog(Object object) {
        long start = System.currentTimeMillis();
        /**
         * 防止SimpleDateFormat 线程不安全导致时间解析失败 这里会重新创建一个GsonBuilder实例
         */
        String json = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create().toJson(object);
        logger.info("转成json结果 json = {}, 耗时 costs = {} ms", json, System.currentTimeMillis() - start);
        return json;
    }

}
