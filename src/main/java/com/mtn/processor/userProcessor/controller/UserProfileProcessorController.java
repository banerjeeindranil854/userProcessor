package com.mtn.processor.userProcessor.controller;

import com.mtn.processor.userProcessor.config.ConfigConnector;
import com.mtn.publicConnector.bean.mtnCommonBean.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

@RestController
@Slf4j
public class UserProfileProcessorController {
    @Autowired
    private ConfigConnector configConnector;
    @RequestMapping(
            method = {RequestMethod.POST},
            value = {"/v2/user"},
            produces = {"application/json"}
    )
    public ResponseEntity<User> getTest() throws IOException, InterruptedException {
        log.info("inside the first processor");
        return ResponseEntity.ok(configConnector.getUserDetails());
    }
}
