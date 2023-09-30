package com.sample.feign.service;

import com.sample.feign.model.UserRequest;
import com.sample.feign.model.UserResponse;

public interface UserService {
    UserResponse retrieveFolio(UserRequest userRequest);
}
