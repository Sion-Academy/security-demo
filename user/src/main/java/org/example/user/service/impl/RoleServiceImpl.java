package org.example.user.service.impl;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.common.model.user.RoleModel;
import org.example.user.dao.RoleMapper;
import org.example.user.entity.RoleEntity;
import org.example.user.service.IRoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleEntity> implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public void createRole(RoleModel model) {
        RoleEntity roleEntity = new RoleEntity();
        BeanUtils.copyProperties(model, roleEntity);
        this.save(roleEntity);
    }

    @Override
    public RoleModel updateRole(Long id, RoleModel model) {
        UpdateWrapper<RoleEntity> updateWrapper = new UpdateWrapper<>();
        RoleEntity roleEntity = new RoleEntity();
        BeanUtils.copyProperties(model, roleEntity);
        updateWrapper.eq("id", id);
        roleMapper.update(updateWrapper);
        return getRoleById(id);
    }

    @Override
    public RoleModel getRoleById(Long id) {
        RoleEntity roleEntity = roleMapper.selectById(id);
        RoleModel roleModel = new RoleModel();
        BeanUtils.copyProperties(roleEntity, roleModel);
        return roleModel;
    }

    @Override
    public void deleteRoleById(Long id) {
        this.removeById(id);
    }
}
