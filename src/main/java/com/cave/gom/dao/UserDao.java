package com.cave.gom.dao;

import com.cave.gom.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

/**
 * Created by sleepbear on 2015-05-31.
 */
@Repository
@MapperScan("com.cave.gom.dao")
public interface UserDao {
    User findById(String id);
}
