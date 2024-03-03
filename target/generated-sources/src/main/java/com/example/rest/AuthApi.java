package com.example.rest;

import com.example.ApiClient;

import com.example.rest.RefreshDto;
import com.example.rest.SignInDto;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-03T13:10:46.671351+01:00[Europe/Podgorica]")
public class AuthApi {
    private ApiClient apiClient;

    public AuthApi() {
        this(new ApiClient());
    }

    public AuthApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Refresh
     * 
     * <p><b>201</b> - Post list
     * <p><b>400</b> - Invalid request
     * <p><b>422</b> - Validation exception
     * @param refreshDto Refresh (required)
     * @return List&lt;RefreshDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<RefreshDto> refresh(RefreshDto refreshDto) throws RestClientException {
        return refreshWithHttpInfo(refreshDto).getBody();
    }

    /**
     * Refresh
     * 
     * <p><b>201</b> - Post list
     * <p><b>400</b> - Invalid request
     * <p><b>422</b> - Validation exception
     * @param refreshDto Refresh (required)
     * @return ResponseEntity&lt;List&lt;RefreshDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<RefreshDto>> refreshWithHttpInfo(RefreshDto refreshDto) throws RestClientException {
        Object localVarPostBody = refreshDto;
        
        // verify the required parameter 'refreshDto' is set
        if (refreshDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'refreshDto' when calling refresh");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<List<RefreshDto>> localReturnType = new ParameterizedTypeReference<List<RefreshDto>>() {};
        return apiClient.invokeAPI("/api/auth/refresh", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Sign In
     * 
     * <p><b>201</b> - Post list
     * <p><b>400</b> - Invalid request
     * <p><b>422</b> - Validation exception
     * @param signInDto Sign In (required)
     * @return List&lt;SignInDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SignInDto> signIn(SignInDto signInDto) throws RestClientException {
        return signInWithHttpInfo(signInDto).getBody();
    }

    /**
     * Sign In
     * 
     * <p><b>201</b> - Post list
     * <p><b>400</b> - Invalid request
     * <p><b>422</b> - Validation exception
     * @param signInDto Sign In (required)
     * @return ResponseEntity&lt;List&lt;SignInDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SignInDto>> signInWithHttpInfo(SignInDto signInDto) throws RestClientException {
        Object localVarPostBody = signInDto;
        
        // verify the required parameter 'signInDto' is set
        if (signInDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'signInDto' when calling signIn");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<List<SignInDto>> localReturnType = new ParameterizedTypeReference<List<SignInDto>>() {};
        return apiClient.invokeAPI("/api/auth/signin", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
