package com.dh.user.domain.repository;

import com.dh.user.configuration.security.openfeign.KeycloakInterceptorConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "users-claims-service", url = "http://localhost:8081", configuration = KeycloakInterceptorConfiguration.class)
public interface FinanceiroFeignClient {

    @GetMapping
    ResponseEntity<String> get();
}
