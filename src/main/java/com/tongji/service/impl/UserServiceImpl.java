package com.tongji.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tongji.entity.User;
import com.tongji.mapper.UserMapper;
import com.tongji.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2020-05-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
