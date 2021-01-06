package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author jcy
 * @data 2021/1/6 - 15:24
 */
public interface IUserDao {
    List<User> findAll();
}
