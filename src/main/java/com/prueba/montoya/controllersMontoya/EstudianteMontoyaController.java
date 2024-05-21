package com.prueba.montoya.controllersMontoya;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.montoya.dto.EstudianteResponseMontoya;
import com.prueba.montoya.entitiesMontoya.EstudianteMontoya;
import com.prueba.montoya.servicesMontoya.EstudianteMontoyaService;



@RestController
@RequestMapping("estudiante")
public class EstudianteMontoyaController {

    @Autowired
    private EstudianteMontoyaService estudianteMontoyaService;

    @GetMapping("")
    public List<EstudianteMontoya> findAllMontoya() {
        return estudianteMontoyaService.findAllMontoya();
    }

    @PostMapping("")
    public ResponseEntity<EstudianteResponseMontoya> saveEstudiante(@RequestBody EstudianteResponseMontoya request) {
        EstudianteResponseMontoya response = estudianteMontoyaService.createMontoya(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("/nombre/{nombreEstudiante}")
    public ResponseEntity<String> deleteByNombreEstudiante(@PathVariable String nombreEstudiante) {
        estudianteMontoyaService.deleteByNombreEstudiante(nombreEstudiante);
        return ResponseEntity.ok("Estudiante eliminado exitosamente.");
    }
    
}
