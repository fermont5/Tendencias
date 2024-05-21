package com.prueba.montoya.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RepresentanteResponseMontoya {
    private Long idRepresentante;
    private String nombreRepresentante;   
    private String emailRepresentante;
    private String numeroRepresentante;
}
