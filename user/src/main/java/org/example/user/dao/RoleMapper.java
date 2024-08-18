package org.example.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.user.entity.RoleEntity;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface RoleMapper extends BaseMapper<RoleEntity> {


}
