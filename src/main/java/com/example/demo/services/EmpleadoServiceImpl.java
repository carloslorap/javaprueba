
package com.example.demo.services;

import com.example.demo.entity.empleadoentity;
import com.example.demo.repository.EmpleadoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl implements empleadoservices{
    @Autowired
    private EmpleadoRepository empleadorepositorio;
    
    @Override
    public List<empleadoentity> findAll() {
        return empleadorepositorio.findAll();
    }

    @Override
    public Optional<empleadoentity> findById(Long Id) {
        return empleadorepositorio.findById(Id);
    }

    @Override
    public List<empleadoentity> findAllCustom() {
       return empleadorepositorio.findAllCustom();
    }

    @Override
    public empleadoentity add(empleadoentity e) {
        return empleadorepositorio.save(e);
    }

    @Override
    public empleadoentity update(empleadoentity e) {
        empleadoentity objempleado=empleadorepositorio.getById(e.getCodigo());
        BeanUtils.copyProperties(e, objempleado);
        return empleadorepositorio.save(objempleado);
    }

    @Override
    public empleadoentity delete(empleadoentity e) {
        empleadoentity objempleado=empleadorepositorio.getById(e.getCodigo());
        objempleado.setEstado(false);
        return empleadorepositorio.save(objempleado);
    }
    
}
