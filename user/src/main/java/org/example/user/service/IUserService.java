package org.example.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.common.model.user.UserModel;
import org.example.user.entity.UserEntity;

public interface IUserService extends IService<UserEntity> {

    UserModel getUserById(Long id);
}
