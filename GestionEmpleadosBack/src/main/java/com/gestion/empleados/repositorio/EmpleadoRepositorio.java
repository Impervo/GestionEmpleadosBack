package com.gestion.empleados.repositorio;

import com.gestion.empleados.modelo.Empleado;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long>{
    
}
