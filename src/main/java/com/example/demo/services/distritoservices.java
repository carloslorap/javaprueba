
package com.example.demo.services;

import com.example.demo.entity.distritoentity;
import java.util.List;
import java.util.Optional;


// en los servicios definimos todos los metodos de crud
public interface distritoservices {
    List<distritoentity>findAll();
    
    Optional<distritoentity>findById(Long Id);
    
    List<distritoentity>findAllCustom();
    
    distritoentity add(distritoentity c);
    distritoentity update(distritoentity c);
    distritoentity delete(distritoentity c);
    
    
}
