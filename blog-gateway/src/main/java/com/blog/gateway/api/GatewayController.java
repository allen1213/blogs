package com.blog.gateway.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "Gateway 测试接口")
public class GatewayController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/app")
    @ApiOperation("获取服务名称")
    public String getAppName() {
        return appName;
    }

}
