package org.example.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.user.dao.UserRoleRelationMapper;
import org.example.user.entity.UserRoleRelationEntity;
import org.example.user.service.IUserRoleRelationService;
import org.springframework.stereotype.Service;


@Service
public class UserRoleRelationServiceImpl extends ServiceImpl<UserRoleRelationMapper, UserRoleRelationEntity> implements IUserRoleRelationService {
}
