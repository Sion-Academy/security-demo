package org.example.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.user.dao.UserMapper;
import org.example.user.entity.UserEntity;
import org.example.user.service.IUserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {
}
