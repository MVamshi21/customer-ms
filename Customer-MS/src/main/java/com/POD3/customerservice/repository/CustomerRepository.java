package com.POD3.customerservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.POD3.customerservice.model.CustomerEntity;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, String> {

}
