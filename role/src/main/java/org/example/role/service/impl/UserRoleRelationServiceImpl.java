package org.example.role.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.example.role.dao.UserRoleRelationMapper;
import org.example.role.entity.UserRoleRelationEntity;
import org.example.role.service.IUserRoleRelationService;
import org.springframework.stereotype.Service;


@Service
public class UserRoleRelationServiceImpl extends ServiceImpl<UserRoleRelationMapper, UserRoleRelationEntity> implements IUserRoleRelationService {
}
