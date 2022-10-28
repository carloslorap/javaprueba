
package com.example.demo.services;

import com.example.demo.entity.distritoentity;
import com.example.demo.repository.DistritoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// en los servicios definimos todos los metodos de crud

// se crea la interface para difinir metodos y asi crear una clase en la cual va implementar todos metodos de esa interface
@Service
public class DistritoServicelmp implements distritoservices{

    @Autowired
    private DistritoRepository distritorepositorio;
    
    @Override
    public List<distritoentity> findAll() {
       return distritorepositorio.findAll();
    }

    @Override
    public Optional<distritoentity> findById(Long Id) {
      return distritorepositorio.findById(Id);
    }

    @Override
    public List<distritoentity> findAllCustom() {
        return distritorepositorio.findAllCustom();
    }

    @Override
    public distritoentity add(distritoentity c) {
       return distritorepositorio.save(c);
    }

    @Override
    public distritoentity update(distritoentity c) {
        distritoentity objdistrito=distritorepositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objdistrito);
       return distritorepositorio.save(objdistrito);
    }

    @Override
    public distritoentity delete(distritoentity c) {
         distritoentity objdistrito=distritorepositorio.getById(c.getCodigo());
         objdistrito.setEstado(false);
        return distritorepositorio.save(objdistrito);
    }
    
}
