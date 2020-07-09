package com.web.play.dao;

import com.web.play.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {
    public User getUserByMessage(@Param("account") String username,@Param("password") String password);
}
