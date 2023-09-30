package com.sample.feign.client;

import com.sample.feign.model.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import com.sample.feign.model.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="demo-mongo", url="${connection.service.url}")
public interface FolioClient {
    @PostMapping(value = "api/v1/retrieve/folio")
    UserResponse getFolioClient(UserRequest userRequest);

}
