package com.mandaovir.logica.aplicacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mandaovir.aplicacion.entidades.User;
import com.mandaovir.aplicacion.entidades.UserAplicacion;


public interface UserAplicacionRepository extends JpaRepository<UserAplicacion, Long> {
	
}
