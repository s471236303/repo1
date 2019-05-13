package com.itheima.dao;

import com.itheima.domain.Items;

public interface ItemsDao {
    /**
     * 根据id进行查找
     * @param id
     * @return
     */
   Items findById(Integer id);
   Items find(Integer id);

}
