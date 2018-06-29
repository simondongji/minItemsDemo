package com.fnkj.simon.springbootmybatisdemo.model;

import lombok.Data;

/**
 * 用户实体
 *
 * @author simon
 * @create 2018-06-22 17:52
 **/
@Data
public class UserDomain {
  private Integer userId;
  
  private String userName;
  
  private String password;
  
  private String phone;
}
