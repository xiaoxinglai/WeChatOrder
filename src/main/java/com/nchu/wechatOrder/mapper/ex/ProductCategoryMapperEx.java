package com.nchu.wechatOrder.mapper.ex;

import com.nchu.wechatOrder.domain.DO.ProductCategory;
import com.nchu.wechatOrder.mapper.ProductCategoryMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductCategoryMapperEx  extends ProductCategoryMapper {


    List<ProductCategory> selectBySellId(String SellId);


}