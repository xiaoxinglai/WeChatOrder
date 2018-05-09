package com.nchu.wechatOrder.service;

import com.nchu.wechatOrder.domain.Result.Result;
import com.nchu.wechatOrder.domain.VO.BaseInfo;
import com.nchu.wechatOrder.domain.VO.PageResult;
import com.nchu.wechatOrder.domain.VO.SureOrderVO;

import java.util.Map;

public interface OrderService {

    //将商品加入购物车
    Result<Boolean> toOrderCar(Map<String,Integer> OrderMap, BaseInfo baseInfo);
    //获取指定用户的购物车信息
    PageResult queryOrderCarByUser(Integer currPage, BaseInfo baseInfo);
    //获取指定用户的订单信息
    PageResult queryUserOrderByUser(Integer currPage, BaseInfo baseInfo);
    //获取指定用户的待退款订单信息
    PageResult queryapplyPayBack(Integer currPage, BaseInfo baseInfo);
    //获取指定用户的退款完成订单信息
    PageResult QueryPayBack(Integer currPage, BaseInfo baseInfo);
    //获取指定用户的商家已经确认接单的信息
    PageResult QuerySureOrder(Integer currPage, BaseInfo baseInfo);

    //取消订单
    Result<Boolean> CancelOrderCar(String OrderId);

    //申请退款
    Result<Boolean> applyPayBack(String OrderId);
    //取消申请退款
    Result<Boolean> CancelapplyPayBack(String OrderId);


    //确认订单
    Result<Boolean> SureOrder(SureOrderVO sureOrderVO);

}