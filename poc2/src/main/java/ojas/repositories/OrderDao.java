package ojas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ojas.entities.Orders;

public interface OrderDao  extends JpaRepository<Orders, Integer>  {

}
