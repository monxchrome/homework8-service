package com.example.homework8service.service;

import com.example.homework8service.dto.OrderDto;
import com.example.homework8service.entity.Order;
import com.example.rest.PostApi;
import com.example.rest.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
@RequiredArgsConstructor
public class OrderService {

    private static final AtomicLong ORDER_ID = new AtomicLong(0);

    private static final Map<Long, Order> ORDERS = new HashMap<>();

    private final PostApi postApi;

    public OrderDto createOrder(OrderDto orderDto) {
        Order order = new Order();
        order.setId(ORDER_ID.getAndIncrement());
        order.setTimestamp(System.currentTimeMillis());

        List<PostDto> posts = postApi.getPosts();

        List<PostDto> existingPosts = orderDto
                                .getPosts()
                                .stream()
                                .flatMap(postName -> posts.stream()
                                    .filter(postDto -> Objects.equals(postDto.getTopic(), postName)))
                                .toList();

        order.setPostIds(existingPosts.stream().map(PostDto::getId).toList());

        ORDERS.put(order.getId(), order);

        return new OrderDto()
                .setId(order.getId())
                .setTimestamp(order.getTimestamp())
                .setPosts(existingPosts.stream().map(PostDto::getTopic).toList());
    }

    public List<OrderDto> getOrders() {
        return ORDERS
                .values()
                .stream()
                .map(this::toDto)
                .toList();
    }

    private OrderDto toDto(Order order) {
        List<PostDto> posts = postApi.getPosts();

        List<String> existingPostTopics = order
                .getPostIds()
                .stream()
                .flatMap(postId -> posts.stream().filter(postDto -> Objects.equals(postDto.getId(), postId)))
                .map(PostDto::getTopic)
                .toList();

        return new OrderDto()
                .setId(order.getId())
                .setTimestamp(order.getTimestamp())
                .setPosts(existingPostTopics);
    }
}
