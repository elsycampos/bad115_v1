package com.bad.sbtel;
// Generated 05-11-2019 11:29:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.sql.Blob;

/**
 * Referencia generated by hbm2java
 */
public class Referencia  implements java.io.Serializable {


     private BigDecimal pkReferencia;
     private Cv cv;
     private CatalogoTipoReferencia catalogoTipoReferencia;
     private String nombreReferencia;
     private long telefonoReferencia;
     private String empresaReferencia;
     private Blob recomendacionPdf;

    public Referencia() {
    }

	
    public Referencia(BigDecimal pkReferencia, Cv cv, CatalogoTipoReferencia catalogoTipoReferencia, String nombreReferencia, long telefonoReferencia) {
        this.pkReferencia = pkReferencia;
        this.cv = cv;
        this.catalogoTipoReferencia = catalogoTipoReferencia;
        this.nombreReferencia = nombreReferencia;
        this.telefonoReferencia = telefonoReferencia;
    }
    public Referencia(BigDecimal pkReferencia, Cv cv, CatalogoTipoReferencia catalogoTipoReferencia, String nombreReferencia, long telefonoReferencia, String empresaReferencia, Blob recomendacionPdf) {
       this.pkReferencia = pkReferencia;
       this.cv = cv;
       this.catalogoTipoReferencia = catalogoTipoReferencia;
       this.nombreReferencia = nombreReferencia;
       this.telefonoReferencia = telefonoReferencia;
       this.empresaReferencia = empresaReferencia;
       this.recomendacionPdf = recomendacionPdf;
    }
   
    public BigDecimal getPkReferencia() {
        return this.pkReferencia;
    }
    
    public void setPkReferencia(BigDecimal pkReferencia) {
        this.pkReferencia = pkReferencia;
    }
    public Cv getCv() {
        return this.cv;
    }
    
    public void setCv(Cv cv) {
        this.cv = cv;
    }
    public CatalogoTipoReferencia getCatalogoTipoReferencia() {
        return this.catalogoTipoReferencia;
    }
    
    public void setCatalogoTipoReferencia(CatalogoTipoReferencia catalogoTipoReferencia) {
        this.catalogoTipoReferencia = catalogoTipoReferencia;
    }
    public String getNombreReferencia() {
        return this.nombreReferencia;
    }
    
    public void setNombreReferencia(String nombreReferencia) {
        this.nombreReferencia = nombreReferencia;
    }
    public long getTelefonoReferencia() {
        return this.telefonoReferencia;
    }
    
    public void setTelefonoReferencia(long telefonoReferencia) {
        this.telefonoReferencia = telefonoReferencia;
    }
    public String getEmpresaReferencia() {
        return this.empresaReferencia;
    }
    
    public void setEmpresaReferencia(String empresaReferencia) {
        this.empresaReferencia = empresaReferencia;
    }
    public Blob getRecomendacionPdf() {
        return this.recomendacionPdf;
    }
    
    public void setRecomendacionPdf(Blob recomendacionPdf) {
        this.recomendacionPdf = recomendacionPdf;
    }




}

