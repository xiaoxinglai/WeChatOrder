package com.nchu.order.VO;

import com.nchu.pojo.DO.OrderDetail;
import com.nchu.pojo.DO.OrderMaster;

import java.util.List;

public class OrderVO {
    private OrderMaster orderMaster;
    private List<OrderDetail> orderDetailList;


    public OrderVO(OrderMaster orderMaster, List<OrderDetail> orderDetailList) {
        this.orderMaster = orderMaster;
        this.orderDetailList = orderDetailList;
    }


    public OrderVO() {
    }

    public OrderMaster getOrderMaster() {
        return orderMaster;
    }

    public void setOrderMaster(OrderMaster orderMaster) {
        this.orderMaster = orderMaster;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
}