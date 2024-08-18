package org.example.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.common.model.user.RoleModel;
import org.example.user.entity.RoleEntity;

public interface IRoleService extends IService<RoleEntity> {

    void createRole(RoleModel model);

    RoleModel updateRole(Long id, RoleModel model);

    RoleModel getRoleById(Long id);

    void deleteRoleById(Long id);
}
