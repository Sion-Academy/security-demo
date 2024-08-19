package org.example.userapi.fallbackFactory;

import lombok.extern.slf4j.Slf4j;
import org.example.common.model.user.UserModel;
import org.example.common.response.Response;
import org.example.userapi.feign.RemoteUserService;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class RemoteUserServiceFallbackFactory implements FallbackFactory<RemoteUserService> {
    @Override
    public RemoteUserService create(Throwable cause) {
        log.error("request user-service failed: {}", cause.getMessage());
        return new RemoteUserService() {

            @Override
            public Response<UserModel> getUserById(Long id) {
                return Response.error("request getUserById failed: " + cause.getCause());
            }

        };
    }
}
