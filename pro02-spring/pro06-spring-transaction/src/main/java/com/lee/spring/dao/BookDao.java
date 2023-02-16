package com.lee.spring.dao;

/**
 * @author LiJing
 * @version 1.0
 */
public interface BookDao {


    Integer getPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void updateBalance(Integer userId, Integer price);

}
