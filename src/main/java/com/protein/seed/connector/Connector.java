package com.protein.seed.connector;

import com.protein.seed.config.FeignConfig;
import com.protein.seed.dto.Blog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "connector", url = "https://jsonplaceholder.typicode.com/", configuration = FeignConfig.class)
public interface Connector {
    @GetMapping("/posts")
    List<Blog> getBlogPosts();

}
