package com.chong.springcloud.service;

import com.chong.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author chong.b.liu
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param(("id")) Long id);
}
