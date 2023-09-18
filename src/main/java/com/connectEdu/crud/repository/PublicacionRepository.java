package com.connectEdu.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.connectEdu.crud.model.Publicacion;

public interface PublicacionRepository extends JpaRepository<Publicacion, Long>{
    
}
