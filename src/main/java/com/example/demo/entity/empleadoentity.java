/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name="empleadoentity")
@Table(name="empleado")

public class empleadoentity implements Serializable{ 
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="codigo")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="distrito", nullable=false)
   
    private distritoentity  distrito;
    
           
}
