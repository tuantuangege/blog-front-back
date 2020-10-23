package com.ttgg.service.impl;

import com.ttgg.entity.User;
import com.ttgg.mapper.UserMapper;
import com.ttgg.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ttgg
 * @since 2020-10-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
