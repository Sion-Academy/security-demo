package org.example.user.controller;

import org.example.common.model.user.UserModel;
import org.example.common.response.Response;
import org.example.user.entity.UserEntity;
import org.example.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    public Response<?> getUserById(@PathVariable Long id) {
        UserModel userById = userService.getUserById(id);
        return Response.success(userById);
    }


}
