package com.mandaovir.ginkanas.logica.daos.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mandaovir.aplicacion.entidades.User;
import com.mandaovir.aplicacion.entidades.UserAplicacion;
import com.mandaovir.ginkanas.entidades.Ginkana;


public interface GinkanaRepository extends JpaRepository<Ginkana, Long> {
	
}
