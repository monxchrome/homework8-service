package com.example.rest;

import com.example.ApiClient;

import com.example.rest.PostDto;

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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-05T17:38:47.025260+01:00[Europe/Podgorica]")
public class PostApi {
    private ApiClient apiClient;

    public PostApi() {
        this(new ApiClient());
    }

    public PostApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create post
     * 
     * <p><b>201</b> - Post
     * <p><b>400</b> - Invalid request
     * <p><b>422</b> - Validation exception
     * @param postDto Post to be created (required)
     * @return PostDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostDto createPost(PostDto postDto) throws RestClientException {
        return createPostWithHttpInfo(postDto).getBody();
    }

    /**
     * Create post
     * 
     * <p><b>201</b> - Post
     * <p><b>400</b> - Invalid request
     * <p><b>422</b> - Validation exception
     * @param postDto Post to be created (required)
     * @return ResponseEntity&lt;PostDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostDto> createPostWithHttpInfo(PostDto postDto) throws RestClientException {
        Object localVarPostBody = postDto;
        
        // verify the required parameter 'postDto' is set
        if (postDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postDto' when calling createPost");
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

        ParameterizedTypeReference<PostDto> localReturnType = new ParameterizedTypeReference<PostDto>() {};
        return apiClient.invokeAPI("/posts", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get specific post
     * Get post by id
     * <p><b>200</b> - Post
     * <p><b>400</b> - Invalid request
     * @param id Post ID (required)
     * @return PostDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostDto getPost(Long id) throws RestClientException {
        return getPostWithHttpInfo(id).getBody();
    }

    /**
     * Get specific post
     * Get post by id
     * <p><b>200</b> - Post
     * <p><b>400</b> - Invalid request
     * @param id Post ID (required)
     * @return ResponseEntity&lt;PostDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostDto> getPostWithHttpInfo(Long id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<PostDto> localReturnType = new ParameterizedTypeReference<PostDto>() {};
        return apiClient.invokeAPI("/posts/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all posts
     * Fetch all existing posts
     * <p><b>200</b> - Post list
     * <p><b>400</b> - Invalid request
     * @return List&lt;PostDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostDto> getPosts() throws RestClientException {
        return getPostsWithHttpInfo().getBody();
    }

    /**
     * Get all posts
     * Fetch all existing posts
     * <p><b>200</b> - Post list
     * <p><b>400</b> - Invalid request
     * @return ResponseEntity&lt;List&lt;PostDto&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostDto>> getPostsWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<List<PostDto>> localReturnType = new ParameterizedTypeReference<List<PostDto>>() {};
        return apiClient.invokeAPI("/posts", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
