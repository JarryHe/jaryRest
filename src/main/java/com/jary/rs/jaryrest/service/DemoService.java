package com.jary.rs.jaryrest.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangyongxin on 2017/10/24.
 */
@Service
public class DemoService {

    Map<String, String> map = new HashMap<>();

    public String setInfo(String key, String value) {
        if (StringUtils.isNotEmpty(key) && StringUtils.isNotEmpty(value))
        map.put(key, value);
        return "success";
    }

    public String getInfo(String key) {
        String value = map.get(key);
        if (StringUtils.isEmpty(value)) {
            value = "人生如逆旅,我亦是行人。";
        }
        return value;
    }

}
