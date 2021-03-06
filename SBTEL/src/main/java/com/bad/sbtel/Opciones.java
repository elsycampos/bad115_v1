package com.bad.sbtel;
// Generated 05-11-2019 11:29:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.sql.Blob;

/**
 * Opciones generated by hbm2java
 */
public class Opciones  implements java.io.Serializable {


     private BigDecimal pkOpciones;
     private ItemPrueba itemPrueba;
     private String opcion;
     private BigDecimal puntajeOpcion;
     private Blob imagenOpcion;

    public Opciones() {
    }

	
    public Opciones(BigDecimal pkOpciones, ItemPrueba itemPrueba, String opcion, BigDecimal puntajeOpcion) {
        this.pkOpciones = pkOpciones;
        this.itemPrueba = itemPrueba;
        this.opcion = opcion;
        this.puntajeOpcion = puntajeOpcion;
    }
    public Opciones(BigDecimal pkOpciones, ItemPrueba itemPrueba, String opcion, BigDecimal puntajeOpcion, Blob imagenOpcion) {
       this.pkOpciones = pkOpciones;
       this.itemPrueba = itemPrueba;
       this.opcion = opcion;
       this.puntajeOpcion = puntajeOpcion;
       this.imagenOpcion = imagenOpcion;
    }
   
    public BigDecimal getPkOpciones() {
        return this.pkOpciones;
    }
    
    public void setPkOpciones(BigDecimal pkOpciones) {
        this.pkOpciones = pkOpciones;
    }
    public ItemPrueba getItemPrueba() {
        return this.itemPrueba;
    }
    
    public void setItemPrueba(ItemPrueba itemPrueba) {
        this.itemPrueba = itemPrueba;
    }
    public String getOpcion() {
        return this.opcion;
    }
    
    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
    public BigDecimal getPuntajeOpcion() {
        return this.puntajeOpcion;
    }
    
    public void setPuntajeOpcion(BigDecimal puntajeOpcion) {
        this.puntajeOpcion = puntajeOpcion;
    }
    public Blob getImagenOpcion() {
        return this.imagenOpcion;
    }
    
    public void setImagenOpcion(Blob imagenOpcion) {
        this.imagenOpcion = imagenOpcion;
    }




}


