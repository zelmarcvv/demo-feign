package com.sample.feign.service.impl;

import com.sample.feign.client.FolioClient;
import com.sample.feign.model.UserRequest;
import com.sample.feign.model.UserResponse;
import com.sample.feign.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private FolioClient folioClient;

    @Override
    public UserResponse retrieveFolio(UserRequest userRequest) {
        log.info("request: " + userRequest.getFolio());
        UserResponse user = folioClient.getFolioClient(userRequest);
        log.info("user: " + user);
        //UserResponse userResponse = new UserResponse(user.getFolio(),user.getName());
        return user;
    }
}
