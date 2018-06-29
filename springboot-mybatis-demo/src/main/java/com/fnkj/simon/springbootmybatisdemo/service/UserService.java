package com.fnkj.simon.springbootmybatisdemo.service;

import com.fnkj.simon.springbootmybatisdemo.model.UserDomain;
import com.github.pagehelper.PageInfo;

/**
 * 服务层接口
 *
 * @author simon
 * @create 2018-06-26 14:39
 **/
public interface UserService {
  int addUser(UserDomain user);
  
  PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
