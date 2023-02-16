package com.lee.spring.service;

/**
 * @author LiJing
 * @version 1.0
 */
public interface CheckoutService {
    void checkout(Integer userId, Integer[] bookIds);
}
