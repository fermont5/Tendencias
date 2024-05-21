package com.prueba.montoya.entitiesMontoya;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "representante", schema = "estudiante")
public class RepresentanteMontoya {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRepresentante;

    @Column(name = "nombre_representante")
    private String nombreRepresentante;

    @Column(name = "email_representante")
    private String emailRepresentante;

    @Column(name = "numero_representante")
    private String numeroRepresentante;
   
    
}
