package com.mandaovir.logica.aplicacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mandaovir.aplicacion.entidades.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
}
