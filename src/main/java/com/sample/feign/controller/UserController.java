package com.sample.feign.controller;

import com.sample.feign.model.UserRequest;
import com.sample.feign.model.UserResponse;
import com.sample.feign.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("v1/get/folio")
    public ResponseEntity<UserResponse> retrieveUser(@RequestBody UserRequest userRequest) {
        UserResponse userResponse = userService.retrieveFolio(userRequest);
        log.info("Response");
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

}
