package com.uisrael.evaluacion1.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "candidato")
public class Candidato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCandidato;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String profesion;
	private String cvUrl;
	private Date fechaCreacion; 
	private boolean estado;

}
