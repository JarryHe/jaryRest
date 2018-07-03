package com.jary.rs.jaryrest.controller;

import com.jary.rs.jaryrest.exception.BusinessException;
import com.jary.rs.jaryrest.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangyongxin on 2017/10/24.
 */
@RestController
public class Controller {

    @Autowired
    private DemoService demoService;

    private static Logger logger = LoggerFactory.getLogger(Controller.class);


    /**
     * @param name
     * @return
     * @throws BusinessException
     */
    @RequestMapping(value = "/sayHello", method = {RequestMethod.GET}, produces="application/json;charset=UTF-8")
    @ResponseBody
    public String sayHello(@ModelAttribute("name") String name) throws BusinessException {
        logger.info("test=========={}", "hahaha");
        return demoService.sayHello();
    }

}
