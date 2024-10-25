package com.uisrael.evaluacion1.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "solicitud")
public class Solicitud implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSolicitud;
	
	@ManyToOne
	@JoinColumn(name = "idCandidato", nullable = false)
	private Candidato candidato;
	
	@ManyToOne
	@JoinColumn(name = "idRequerimiento", nullable = false)
	private Requerimiento requerimiento;
	
	private Date fechaSolicitud;
	private boolean estado;
	
	
	

}
