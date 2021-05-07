package ojas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ojas.entities.Products;

public interface ProductDao extends JpaRepository<Products, Integer> {

}
