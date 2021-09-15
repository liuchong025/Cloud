package com.chong.springcloud.service;

import com.chong.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author chong.b.liu
 */
@Component
@FeignClient(value = "ClOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value="/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);
}
