package com.seudominio.nomeprojeto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teste")
public class TesteController {
    
    @GetMapping
    public String teste() {
        return "Bem-vindo à página de teste!";
    }
}
