package com.lee.mybatisplus.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.mybatisplus.bean.Product;
import com.lee.mybatisplus.mapper.ProductMapper;
import com.lee.mybatisplus.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author LiJing
 * @version 1.0
 */
@DS("slave_1")
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
