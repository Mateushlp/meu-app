package com.net.meuservico.meuapp.repositories;

import com.net.meuservico.meuapp.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
  {}