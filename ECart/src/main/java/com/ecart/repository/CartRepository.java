package com.ecart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecart.entity.CartEntity;


public interface CartRepository extends JpaRepository<CartEntity, String>{

}
