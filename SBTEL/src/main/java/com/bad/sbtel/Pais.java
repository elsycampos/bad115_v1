package com.bad.sbtel;
// Generated 05-11-2019 11:29:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Pais generated by hbm2java
 */
public class Pais  implements java.io.Serializable {


     private BigDecimal pkPais;
     private String nombrePais;
     private Set<Departamento> departamentos = new HashSet<Departamento>(0);
     private Set<Evento> eventos = new HashSet<Evento>(0);

    public Pais() {
    }

	
    public Pais(BigDecimal pkPais, String nombrePais) {
        this.pkPais = pkPais;
        this.nombrePais = nombrePais;
    }
    public Pais(BigDecimal pkPais, String nombrePais, Set<Departamento> departamentos, Set<Evento> eventos) {
       this.pkPais = pkPais;
       this.nombrePais = nombrePais;
       this.departamentos = departamentos;
       this.eventos = eventos;
    }
   
    public BigDecimal getPkPais() {
        return this.pkPais;
    }
    
    public void setPkPais(BigDecimal pkPais) {
        this.pkPais = pkPais;
    }
    public String getNombrePais() {
        return this.nombrePais;
    }
    
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    public Set<Departamento> getDepartamentos() {
        return this.departamentos;
    }
    
    public void setDepartamentos(Set<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    public Set<Evento> getEventos() {
        return this.eventos;
    }
    
    public void setEventos(Set<Evento> eventos) {
        this.eventos = eventos;
    }




}


