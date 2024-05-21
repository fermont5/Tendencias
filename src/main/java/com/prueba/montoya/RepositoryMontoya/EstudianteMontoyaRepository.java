package com.prueba.montoya.RepositoryMontoya;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.prueba.montoya.entitiesMontoya.EstudianteMontoya;

public interface EstudianteMontoyaRepository extends JpaRepository<EstudianteMontoya, Long> {
    List<EstudianteMontoya> findByNombreEstudiante(String nombreEstudiante);
    void deleteByNombreEstudiante(String nombreEstudiante);
}