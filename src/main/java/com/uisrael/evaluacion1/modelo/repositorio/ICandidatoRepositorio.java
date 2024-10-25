package com.uisrael.evaluacion1.modelo.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.evaluacion1.modelo.entidades.Candidato;

public interface ICandidatoRepositorio extends JpaRepository<Candidato, Integer> {

}
