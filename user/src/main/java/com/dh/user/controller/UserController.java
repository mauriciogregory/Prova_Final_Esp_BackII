package com.dh.user.controller;

import com.dh.user.domain.repository.FinanceiroFeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {


    private final FinanceiroFeignClient cliente;

    public UserController(FinanceiroFeignClient cliente) {
        this.cliente = cliente;
    }

    @GetMapping
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok("Usuario " + cliente.get().getBody());
    }
}
