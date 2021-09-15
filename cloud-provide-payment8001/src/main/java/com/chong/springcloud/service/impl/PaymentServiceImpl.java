package com.chong.springcloud.service.impl;

import com.chong.springcloud.dao.PaymentDao;
import com.chong.springcloud.entities.Payment;
import com.chong.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chong.b.liu
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(@Param(("id")) Long id){
        return paymentDao.getPaymentById(id);
    }

}
