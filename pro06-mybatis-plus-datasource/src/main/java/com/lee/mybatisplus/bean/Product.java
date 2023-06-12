package com.lee.mybatisplus.bean;

import lombok.Data;

/**
 * @author LiJing
 * @version 1.0
 */
@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
    private Integer version;
}
