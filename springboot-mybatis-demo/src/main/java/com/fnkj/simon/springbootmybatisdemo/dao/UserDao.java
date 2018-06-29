package com.fnkj.simon.springbootmybatisdemo.dao;

import com.fnkj.simon.springbootmybatisdemo.model.UserDomain;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户查询
 *
 * @author simon
 * @create 2018-06-22 17:57
 **/
@Mapper
public interface UserDao {
  @Insert("INSERT INTO T_USER(NAME, PASSWORD, PHONE) VALUES(#{name}, #{password}, #{phone})")
  int insert(UserDomain userDomain);
  
  @Select("SELECT * FROM T_USER")
  List<UserDomain> selectUsers();
}
