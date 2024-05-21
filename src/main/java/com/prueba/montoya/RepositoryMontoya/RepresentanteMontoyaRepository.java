package com.prueba.montoya.RepositoryMontoya;


import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.prueba.montoya.entitiesMontoya.RepresentanteMontoya;


public interface RepresentanteMontoyaRepository extends CrudRepository<RepresentanteMontoya, Long>{
    List<RepresentanteMontoya> findAll();
    
}
