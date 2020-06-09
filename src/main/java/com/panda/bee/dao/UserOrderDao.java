package com.panda.bee.dao;

import com.panda.bee.pojo.entity.UserOrder;

public interface UserOrderDao {
    int deleteByPrimaryKey(String orderId);

    int insert(UserOrder record);

    int insertSelective(UserOrder record);

    UserOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(UserOrder record);

    int updateByPrimaryKey(UserOrder record);
}