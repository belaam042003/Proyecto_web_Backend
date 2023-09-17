package com.connectEdu.crudProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.connectEdu.crudProject.model.Publicacion;

public interface PublicacionRepository extends JpaRepository<Publicacion, Long>{
    
}
