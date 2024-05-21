package com.prueba.montoya.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstudianteResponseMontoya {
    private Long idEstudiante;
    private String nombreEstudiante;    
    private Integer edadEstudiante;
    private Boolean isActive;
    private Date createdAt;

    private RepresentanteResponseMontoya representante;
 
}