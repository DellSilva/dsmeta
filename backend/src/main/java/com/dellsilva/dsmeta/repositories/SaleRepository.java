package com.dellsilva.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dellsilva.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
