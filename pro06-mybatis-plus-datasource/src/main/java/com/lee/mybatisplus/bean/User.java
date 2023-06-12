package com.lee.mybatisplus.bean;

import lombok.Data;

/**
 * @author LiJing
 * @version 1.0
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private Integer sex;
    private String email;
    private Integer isDeleted;
}
