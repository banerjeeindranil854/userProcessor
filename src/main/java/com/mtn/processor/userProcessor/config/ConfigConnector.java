package com.mtn.processor.userProcessor.config;

import com.mtn.publicConnector.backend.mtnBackendConnectorUserProfile.controller.UserProfileController;
import com.mtn.publicConnector.bean.mtnCommonBean.bean.User;
import com.mtn.publicConnector.bean.mtnCommonBean.util.CreateObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigConnector {
@Autowired
    private ApplicationContext app;

    @Value("${userProfile.url.path}")
    private String USER_URL;


    @Value("${custom.header.value}")
    private String HEADER_VALUE;

    @Bean("userProfileController")
    public UserProfileController createUserProfileController(){
        return new UserProfileController();
    }
    @Bean("user")
    public User getUserDetails(){
        UserProfileController userProfileController =app.getBean(UserProfileController.class);
        return userProfileController.getForObject(HEADER_VALUE,USER_URL, CreateObject.createUserBeanObject());
    }
}
