package com.example.springdataboot.repository;

import com.example.springdataboot.etity.Account;
import com.example.springdataboot.etity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OderRepository extends JpaRepository<Order,Long> {

}
