package org.example.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.common.model.user.UserModel;
import org.example.user.dao.UserMapper;
import org.example.user.entity.UserEntity;
import org.example.user.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserModel getUserById(Long id) {
        UserEntity byId = getById(id);
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(byId, userModel);
        return userModel;
    }
}
