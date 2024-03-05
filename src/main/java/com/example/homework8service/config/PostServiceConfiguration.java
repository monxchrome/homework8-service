package com.example.homework8service.config;

import com.example.ApiClient;
import com.example.rest.PostApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

@Configuration
public class PostServiceConfiguration {

    @Bean
    public ApiClient apiClientWithAuth() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBearerToken(() -> {
            JwtAuthenticationToken jwtAuthenticationToken = (JwtAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
            return jwtAuthenticationToken.getToken().getTokenValue();
        });
        apiClient.setMaxAttemptsForRetry(10);
        apiClient.setWaitTimeMillis(1000);
        apiClient.setDebugging(true);
        return apiClient;
    }

    @Bean
    public PostApi postApi() {
        return new PostApi(apiClientWithAuth());
    }
}
