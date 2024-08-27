package com.tecnosmart.salespro.repository;

import com.tecnosmart.salespro.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
