package com.boyiz.gulimall.order.vo;

import com.boyiz.gulimall.order.entity.OrderEntity;
import lombok.Data;


@Data
public class SubmitOrderResponseVo {

    private OrderEntity order;

    /** 错误状态码 **/
    private Integer code;


}
