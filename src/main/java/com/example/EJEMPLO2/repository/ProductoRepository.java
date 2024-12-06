package com.example.EJEMPLO2.repository;

import com.example.EJEMPLO2.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
