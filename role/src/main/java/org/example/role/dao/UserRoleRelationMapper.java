package org.example.role.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.role.entity.UserRoleRelationEntity;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserRoleRelationMapper extends BaseMapper<UserRoleRelationEntity> {
}
