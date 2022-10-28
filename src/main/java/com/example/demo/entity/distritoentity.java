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
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

//para hacer el llamado a las tablas de la base de datos y asiganarle una variable

@Entity(name="distritoentity")
@Table(name="distrito") 

public class distritoentity implements Serializable {
    
    private static final long serialVersionUID=1L;
    
    //invocamos la anotacion id para indicar la columna tiene asociado el campo codigo quien sera la clase principal 
    // entoces despues se invoca la anotacion generatevalue para indicar q estrategia usaremos entoces el generaty va a ser entity y asi establecemos el tipo de codigo que es el long
    @Id
    @Column(name="codigo")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long codigo;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="estado")
    private boolean estado;
       
}
