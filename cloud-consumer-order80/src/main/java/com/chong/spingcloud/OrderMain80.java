package com.chong.spingcloud;

import com.chong.myrule.MysSelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author chong.b.liu
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD_PAYMENT_SERVICE",configuration = MysSelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
