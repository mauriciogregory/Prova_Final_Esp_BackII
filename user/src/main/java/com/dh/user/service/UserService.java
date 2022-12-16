package com.dh.user.service;

import com.dh.user.domain.repository.FinanceiroFeignClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final FinanceiroFeignClient cliente;

    public UserService(FinanceiroFeignClient cliente) {
        this.cliente = cliente;
    }
}
