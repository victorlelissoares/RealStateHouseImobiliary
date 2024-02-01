package com.gm2.realestatehouse.repository;

import com.gm2.realestatehouse.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
