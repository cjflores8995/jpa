package com.uisrael.evaluacion1;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.evaluacion1.modelo.entidades.Candidato;
import com.uisrael.evaluacion1.servicios.ICandidatoServicio;

@SpringBootTest
class Evaluacion1ApplicationTests {
	
	@Autowired
	ICandidatoServicio servicio;

	@Test
	void contextLoads() {
		Candidato obj = new Candidato();
		obj.setNombre("test name");
		obj.setApellido("test name");
		obj.setEmail("test name");
		obj.setTelefono("test name");
		obj.setProfesion("test name");
		obj.setCvUrl("test name");
		obj.setNombre("test name");
		
		
		servicio.insertar(obj);
	}

}
