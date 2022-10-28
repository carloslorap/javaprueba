package com.example.demo.repository;


import com.example.demo.entity.distritoentity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DistritoRepository extends JpaRepository<distritoentity,Long> {
    //select * from distrito where estCu=1; MySQL
     //select variable from  entidad variable; JPQL
    
    // el repositorio se creo para llamar a todo los registros habilitados
   @Query("select c from distritoentity c where c.estado='1'")
   List<distritoentity>findAllCustom();
}

