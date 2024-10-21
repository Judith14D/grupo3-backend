package edu.cibertec.pe.proyecto_backend.controller;

import edu.cibertec.pe.proyecto_backend.dto.AlumnoResponse;
import edu.cibertec.pe.proyecto_backend.service.ListadoAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listado")
public class ListadoAlumnoController {

    @Autowired
    ListadoAlumnoService listadoAlumnoService;

    @GetMapping("/alumnos")
    public List<AlumnoResponse> obtenerListadoAlumno() {

        try {
            List<AlumnoResponse> listadoAlumno = listadoAlumnoService.obtenerAlumnos();

            if (listadoAlumno != null) {
                return listadoAlumno;
            } else {
                return null;
            }

        } catch (Exception e){
            return null;
        }
    }
}
