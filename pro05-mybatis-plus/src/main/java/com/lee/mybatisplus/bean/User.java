package com.lee.mybatisplus.bean;

import com.baomidou.mybatisplus.annotation.*;
import com.lee.mybatisplus.enums.SexEnum;
import lombok.Data;

/**
 * @author LiJing
 * @version 1.0
 */
//设置实体类所对应的表名
//@TableName("t_user")
@Data
public class User {

    //将该属性所对应的字段指定为主键
    //@TableId注解的value属性用于指定主键字段
    //@TableId注解的type属性用于设置主键生成策略
//    @TableId(value = "uid", type = IdType.AUTO)
    private Long id;

    //指定属性所对应的字段名
//    @TableField("user_name")
    private String name;
    private Integer age;
    private SexEnum sex;
    private String email;

    //逻辑删除
//    @TableLogic
    private Integer isDeleted;
}
