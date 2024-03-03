package com.example.rest;

import com.example.ApiClient;

import com.example.rest.CommentDto;

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
public class CommentApi {
    private ApiClient apiClient;

    public CommentApi() {
        this(new ApiClient());
    }

    public CommentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create comment
     * 
     * <p><b>201</b> - Comment
     * <p><b>400</b> - Invalid request
     * <p><b>422</b> - Validation exception
     * @param commentDto Comment to be created (required)
     * @return CommentDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentDto createComment(CommentDto commentDto) throws RestClientException {
        return createCommentWithHttpInfo(commentDto).getBody();
    }

    /**
     * Create comment
     * 
     * <p><b>201</b> - Comment
     * <p><b>400</b> - Invalid request
     * <p><b>422</b> - Validation exception
     * @param commentDto Comment to be created (required)
     * @return ResponseEntity&lt;CommentDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommentDto> createCommentWithHttpInfo(CommentDto commentDto) throws RestClientException {
        Object localVarPostBody = commentDto;
        
        // verify the required parameter 'commentDto' is set
        if (commentDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentDto' when calling createComment");
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

        ParameterizedTypeReference<CommentDto> localReturnType = new ParameterizedTypeReference<CommentDto>() {};
        return apiClient.invokeAPI("/ws/comments", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
