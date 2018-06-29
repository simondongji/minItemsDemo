package com.fnkj.simon.springbootmybatisdemo.controller;

import com.fnkj.simon.springbootmybatisdemo.model.UserDomain;
import com.fnkj.simon.springbootmybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * controller层
 *
 * @author simon
 * @create 2018-06-26 14:46
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {
  @Autowired
  private UserService userService;
  
  @ResponseBody
  @PostMapping("/add")
  public int addUser(UserDomain user){
    return userService.addUser(user);
  }
  
  @ResponseBody
  @GetMapping("/all")
  public Object findAllUser(
          @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                  int pageNum,
          @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                  int pageSize){
    return userService.findAllUser(pageNum,pageSize);
  }
}
