package com.hibernateinheritance.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.hibernateinheritance.demo.entity.Payment;

public interface PaymentRepo extends CrudRepository<Payment, Integer> {

}
