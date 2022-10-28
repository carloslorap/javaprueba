/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.entity.empleadoentity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Carlos
 */
public interface EmpleadoRepository extends JpaRepository<empleadoentity,Long> {
    
    @Query("select e from empleadoentity e where e.estado='1'")
    List<empleadoentity>findAllCustom();
}
