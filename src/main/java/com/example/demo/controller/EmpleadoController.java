
package com.example.demo.controller;

import com.example.demo.entity.empleadoentity;

import com.example.demo.services.empleadoservices;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
     @Autowired
    private empleadoservices empleadoservice;
     
     @GetMapping 
    public List<empleadoentity> findAll(){
        return empleadoservice.findAll();         
    }
     @GetMapping("/Custom")
    public List<empleadoentity> findAllCustom(){
        return empleadoservice.findAllCustom();
    }
    
     @GetMapping("/{id}")
    public Optional<empleadoentity> findById(@PathVariable Long id){
        return empleadoservice.findById(id);
    }
    
     /* nos permitira añadir un valor*/
     @PostMapping
     public empleadoentity add (@RequestBody empleadoentity e){
         return empleadoservice.add(e);
     }
     
     @PutMapping("/{id}")
     public empleadoentity update(@PathVariable Long id,@RequestBody empleadoentity e){
        e.setCodigo(id);
      return empleadoservice.update(e);
     }
     
         @DeleteMapping("/id")
    public empleadoentity delete(@PathVariable long id){
        empleadoentity objempleado = new  empleadoentity();
        objempleado.setEstado(false);
        return empleadoservice.delete(empleadoentity.builder().codigo(id).build());
    }
}

