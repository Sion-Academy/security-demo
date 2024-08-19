package org.example.userapi.feign;


import org.example.common.constants.ServerName;
import org.example.common.model.user.UserModel;
import org.example.common.response.Response;
import org.example.userapi.fallbackFactory.RemoteUserServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = ServerName.USER_SERVER, contextId = "userClient", fallbackFactory = RemoteUserServiceFallbackFactory.class)
public interface RemoteUserService {

    @GetMapping("/{id}")
    Response<UserModel> getUserById(@PathVariable Long id);
}
