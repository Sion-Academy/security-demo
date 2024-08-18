package org.example.user.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.user.entity.UserRoleRelationEntity;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserRoleRelationMapper extends BaseMapper<UserRoleRelationEntity> {
}
