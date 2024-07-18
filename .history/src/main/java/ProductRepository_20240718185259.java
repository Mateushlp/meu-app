package com.seudominio.nomeprojeto.repositories;

import com.seudominio.nomeprojeto.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // métodos personalizados de consulta, se necessário
}
