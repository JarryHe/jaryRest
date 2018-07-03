package com.didapinche.rs.template.service;

import com.didapinche.server.commons.common.ReplyMap;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yangyongxin on 2017/10/24.
 */
@Service
public class DemoService {

    public ReplyMap sayHello(){

        ReplyMap replyMap = new ReplyMap();


        replyMap.success();
        return replyMap;
    }

}
