package com.prueba.montoya.servicesMontoya;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.montoya.RepositoryMontoya.EstudianteMontoyaRepository;
import com.prueba.montoya.RepositoryMontoya.RepresentanteMontoyaRepository;
import com.prueba.montoya.dto.EstudianteResponseMontoya;
import com.prueba.montoya.dto.RepresentanteResponseMontoya;
import com.prueba.montoya.entitiesMontoya.EstudianteMontoya;
import com.prueba.montoya.entitiesMontoya.RepresentanteMontoya;

import org.springframework.transaction.annotation.Transactional;

@Service
public class EstudianteMontoyaService {

    @Autowired
    private EstudianteMontoyaRepository estudianteMontoyaRepository;

    @Autowired
    private RepresentanteMontoyaRepository representanteMontoyaRepository;

    public List<EstudianteMontoya> findAllMontoya() {
        return estudianteMontoyaRepository.findAll();
    }

    public EstudianteResponseMontoya createMontoya(EstudianteResponseMontoya request) {

        RepresentanteMontoya representante = RepresentanteMontoya.builder()
                .nombreRepresentante(request.getRepresentante().getNombreRepresentante())
                .emailRepresentante(request.getRepresentante().getEmailRepresentante())
                .numeroRepresentante(request.getRepresentante().getNumeroRepresentante())
                .build();
        RepresentanteMontoya representanteSaved = representanteMontoyaRepository.save(representante);

        EstudianteMontoya estudiante = EstudianteMontoya.builder()
                .nombreEstudiante(request.getNombreEstudiante())
                .edadEstudiante(request.getEdadEstudiante())
                .isActive(true)
                .createdAt(new Date())
                .representante(representanteSaved)
                .build();
        EstudianteMontoya estudianteSaved = estudianteMontoyaRepository.save(estudiante);

        // Construir la respuesta
        return EstudianteResponseMontoya.builder()
                .idEstudiante(estudianteSaved.getIdEstudiante())
                .nombreEstudiante(estudianteSaved.getNombreEstudiante())
                .edadEstudiante(estudianteSaved.getEdadEstudiante())
                .isActive(estudianteSaved.isActive())
                .createdAt(estudianteSaved.getCreatedAt())
                .representante(RepresentanteResponseMontoya.builder()
                        .idRepresentante(representanteSaved.getIdRepresentante())
                        .nombreRepresentante(representanteSaved.getNombreRepresentante())
                        .emailRepresentante(representanteSaved.getEmailRepresentante())
                        .numeroRepresentante(representanteSaved.getNumeroRepresentante())
                        .build())
                .build();
    }

    @Transactional
    public void deleteByNombreEstudiante(String nombreEstudiante) {
        estudianteMontoyaRepository.deleteByNombreEstudiante(nombreEstudiante);
    }

}
