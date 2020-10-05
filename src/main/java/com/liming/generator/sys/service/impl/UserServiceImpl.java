package com.liming.generator.sys.service.impl;

import com.liming.generator.sys.entity.User;
import com.liming.generator.sys.mapper.UserMapper;
import com.liming.generator.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liming
 * @since 2020-10-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
