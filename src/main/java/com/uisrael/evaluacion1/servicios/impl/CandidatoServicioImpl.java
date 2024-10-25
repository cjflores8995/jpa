package com.uisrael.evaluacion1.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.evaluacion1.modelo.entidades.Candidato;
import com.uisrael.evaluacion1.modelo.repositorio.ICandidatoRepositorio;
import com.uisrael.evaluacion1.servicios.ICandidatoServicio;

@Service
@Component
public class CandidatoServicioImpl implements ICandidatoServicio {

	@Autowired
	private ICandidatoRepositorio repositorio;
	private String elemento = "Candidato";
	
	@Override
	public void insertar(Candidato nuevo) {
		try 
		{
			repositorio.save(nuevo);
		} 
		catch(Exception  e) {
			System.out.println("Error: Insertar " + elemento + ": "  + e.getMessage());
		}
		
	}
	
	

}
