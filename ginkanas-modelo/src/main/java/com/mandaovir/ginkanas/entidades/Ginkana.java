package com.mandaovir.ginkanas.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.mandaovir.aplicacion.entidades.User;
import com.mandaovir.aplicacion.entidades.UserAplicacion;

@Entity
@Table(name="ginkanas")
public class Ginkana {
	@Id
	@Column(name="id", nullable=false, precision=10)
	@GeneratedValue( strategy= GenerationType.AUTO, generator="native" )
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToOne(optional=false, targetEntity=UserAplicacion.class)
    @JoinColumn(updatable=false, name="id_user")
	private UserAplicacion propietario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public UserAplicacion getPropietario() {
		return propietario;
	}

	public void setPropietario(UserAplicacion propietario) {
		this.propietario = propietario;
	}
}
