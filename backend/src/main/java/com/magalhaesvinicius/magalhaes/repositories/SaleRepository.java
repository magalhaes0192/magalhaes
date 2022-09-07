package com.magalhaesvinicius.magalhaes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magalhaesvinicius.magalhaes.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale, Long> {

}
