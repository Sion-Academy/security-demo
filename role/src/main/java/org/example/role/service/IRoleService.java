package org.example.role.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.common.model.role.RoleModel;
import org.example.role.entity.RoleEntity;

public interface IRoleService extends IService<RoleEntity> {

    void createRole(RoleModel model);

    RoleModel updateRole(Long id, RoleModel model);

    RoleModel getRoleById(Long id);

    void deleteRoleById(Long id);
}
