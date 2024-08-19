package org.example.role.controller;


import org.example.common.model.role.RoleModel;
import org.example.common.response.Response;
import org.example.role.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @PostMapping
    public Response<?> createRole(@RequestBody @Validated RoleModel model) {
        roleService.createRole(model);
        return Response.success();
    }

    @PutMapping("/{id}")
    public Response<?> updateRole(@PathVariable Long id, @RequestBody @Validated RoleModel model) {
        RoleModel roleModel = roleService.updateRole(id, model);
        return Response.success(roleModel);
    }


    @GetMapping("/{id}")
    public Response<?> getRoleById(@PathVariable Long id) {
        RoleModel roleById = roleService.getRoleById(id);
        return Response.success(roleById);
    }

    @DeleteMapping("/{id}")
    public Response<?> deleteRole(@PathVariable Long id) {
        roleService.deleteRoleById(id);
        return Response.success();
    }
}
