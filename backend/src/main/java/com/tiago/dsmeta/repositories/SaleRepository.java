package com.tiago.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiago.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer> {

}
