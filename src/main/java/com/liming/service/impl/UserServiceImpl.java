package com.liming.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liming.entity.User;
import com.liming.mapper.UserMapper;
import com.liming.service.IUserService;
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
