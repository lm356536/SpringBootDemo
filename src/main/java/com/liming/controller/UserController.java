package com.liming.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.liming.entity.User;
import com.liming.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liming
 * @since 2020-10-05
 */
@RestController
@RequestMapping("/user")
public class UserController {

  @Resource
  private UserMapper mapper;

  @RequestMapping("/list")
  public List selectMaps() {
    List<Map<String, Object>> mapList = mapper.selectMaps(Wrappers.<User>query().orderByAsc("age"));
    return mapList;
  }
}
