package com.example.homework8service.config;

import com.example.ApiClient;
import com.example.rest.PostApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostServiceConfiguration {

    @Bean
    public ApiClient apiClient() {
        ApiClient apiClient = new ApiClient();
        apiClient.setDebugging(true);
        apiClient.setBasePath("http://localhost:8080/");
        return apiClient;
    }

    @Bean
    public PostApi postApi() {
        return new PostApi(apiClient());
    }
}
