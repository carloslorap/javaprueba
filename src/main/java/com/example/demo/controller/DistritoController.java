
package com.example.demo.controller;

import com.example.demo.entity.distritoentity;
import com.example.demo.services.distritoservices;
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

//El en controlador creamos por q contiene una lógica que actualiza el modelo
// o vista en respuesta a las entradas de los usuarios de la aplicación.

@RestController
@RequestMapping("/distrito")
public class DistritoController {
    // es una anotación que permite inyectar unas dependencias con otras dentro de Spring 
    @Autowired
    private distritoservices distritoservice;
    
    /* nos permitira leer el listado*/
    @GetMapping 
    public List<distritoentity> findAll(){
        return distritoservice.findAll();         
    }
    //custom es para ver todos los habilitados
    @GetMapping("/Custom")
    public List<distritoentity> findAllCustom(){
        return distritoservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<distritoentity> findById(@PathVariable Long id){
        return distritoservice.findById(id);
    }
    
    /* nos permitira añadir un valor*/
     @PostMapping
     public distritoentity add (@RequestBody distritoentity c){
         return distritoservice.add(c);
     }
      /* nos permitira actualizar un valor*/
     @PutMapping("/{id}")
     public distritoentity update(@PathVariable Long id,@RequestBody distritoentity c){
        c.setCodigo(id);
      return distritoservice.update(c);
     }
     
      @DeleteMapping("/id")
    public distritoentity delete(@PathVariable long id){
        distritoentity objdistrito = new  distritoentity();
        objdistrito.setEstado(false);
        return distritoservice.delete(distritoentity.builder().codigo(id).build());
    }
}
