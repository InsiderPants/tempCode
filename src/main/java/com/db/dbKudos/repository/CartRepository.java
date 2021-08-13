package com.db.dbKudos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.dbKudos.model.Cart;

public interface CartRepository extends JpaRepository<Cart, String> {

}
