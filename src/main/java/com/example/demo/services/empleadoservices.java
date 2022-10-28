package com.example.demo.services;

import com.example.demo.entity.empleadoentity;
import java.util.List;
import java.util.Optional;

 
public interface empleadoservices {
     List<empleadoentity>findAll();
    
    Optional<empleadoentity>findById(Long Id);
    
    List<empleadoentity>findAllCustom();
    
    empleadoentity add(empleadoentity e);
    empleadoentity update(empleadoentity e);
    empleadoentity delete(empleadoentity e);
}
