package com.mtn.processor.userProcessor.config;

import com.mtn.processor.userProcessor.controller.UserProfileProcessorController;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfigProcessor {
    @Bean
    public GroupedOpenApi apiV2() {
        return GroupedOpenApi.builder()
                .group("v2")
                .packagesToScan(UserProfileProcessorController.class.getPackageName())
                .build();
    }
}
