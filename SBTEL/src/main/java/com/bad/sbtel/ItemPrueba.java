package com.bad.sbtel;
// Generated 05-11-2019 11:29:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * ItemPrueba generated by hbm2java
 */
public class ItemPrueba  implements java.io.Serializable {


     private BigDecimal pkItem;
     private Prueba prueba;
     private String pregunta;
     private Set<Opciones> opcioneses = new HashSet<Opciones>(0);

    public ItemPrueba() {
    }

	
    public ItemPrueba(BigDecimal pkItem, Prueba prueba, String pregunta) {
        this.pkItem = pkItem;
        this.prueba = prueba;
        this.pregunta = pregunta;
    }
    public ItemPrueba(BigDecimal pkItem, Prueba prueba, String pregunta, Set<Opciones> opcioneses) {
       this.pkItem = pkItem;
       this.prueba = prueba;
       this.pregunta = pregunta;
       this.opcioneses = opcioneses;
    }
   
    public BigDecimal getPkItem() {
        return this.pkItem;
    }
    
    public void setPkItem(BigDecimal pkItem) {
        this.pkItem = pkItem;
    }
    public Prueba getPrueba() {
        return this.prueba;
    }
    
    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }
    public String getPregunta() {
        return this.pregunta;
    }
    
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    public Set<Opciones> getOpcioneses() {
        return this.opcioneses;
    }
    
    public void setOpcioneses(Set<Opciones> opcioneses) {
        this.opcioneses = opcioneses;
    }




}


