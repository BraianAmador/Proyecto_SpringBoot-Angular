package com.bamador.crudFullstackAngular.repository;

import com.bamador.crudFullstackAngular.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Integer> {

}
