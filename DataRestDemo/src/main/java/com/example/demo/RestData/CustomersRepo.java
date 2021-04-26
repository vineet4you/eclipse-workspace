package com.example.demo.RestData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel="Customers", path="customers")
public interface CustomersRepo extends JpaRepository<Customers, Integer> {

}
