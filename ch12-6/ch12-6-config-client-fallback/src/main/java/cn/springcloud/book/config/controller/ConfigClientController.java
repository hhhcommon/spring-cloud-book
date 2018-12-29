package cn.springcloud.book.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shannon
 */
@RestController
@RequestMapping("configConsumer")
@RefreshScope
public class ConfigClientController {
    @Value("${cn.springcloud.book.config}")
    private String config;

    @RequestMapping("/getConfigInfo")
    public String getConfigInto() {
        return config;
    }
}
