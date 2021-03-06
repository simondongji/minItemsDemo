package com.fnkj.simon.springbootmybatisdemo.service.impl;

import com.fnkj.simon.springbootmybatisdemo.dao.UserDao;
import com.fnkj.simon.springbootmybatisdemo.model.UserDomain;
import com.fnkj.simon.springbootmybatisdemo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务接口实现
 *
 * @author simon
 * @create 2018-06-26 14:41
 **/
@Service
public class UserServiceImpl implements UserService {
  
  @Autowired
  private UserDao userDao;
  
  @Override
  public int addUser(UserDomain user) {
    return userDao.insert(user);
  }
  /*
   * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
   * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
   * pageNum 开始页数
   * pageSize 每页显示的数据条数
   * */
  @Override
  public PageInfo<UserDomain> findAllUser(int pageNum, int pageSize) {
    //将参数传给这个方法就可以实现物理分页了，非常简单。
    PageHelper.startPage(pageNum, pageSize);
    List<UserDomain> userDomains = userDao.selectUsers();
    PageInfo result = new PageInfo(userDomains);
    return result;
  }
}
