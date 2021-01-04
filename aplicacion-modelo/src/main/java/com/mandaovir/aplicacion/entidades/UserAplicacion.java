package com.mandaovir.aplicacion.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="users")
public class UserAplicacion{

	@Id
	@Column(name="id", nullable=false, precision=10)
	@GeneratedValue( strategy= GenerationType.AUTO, generator="native" )
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="enabled")
	private Boolean enabled;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
}