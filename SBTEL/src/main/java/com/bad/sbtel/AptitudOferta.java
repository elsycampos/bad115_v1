package com.bad.sbtel;
// Generated 05-11-2019 11:29:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * AptitudOferta generated by hbm2java
 */
public class AptitudOferta  implements java.io.Serializable {


     private BigDecimal pkAptitudOferta;
     private CatalogoAptitud catalogoAptitud;
     private Oferta oferta;

    public AptitudOferta() {
    }

    public AptitudOferta(BigDecimal pkAptitudOferta, CatalogoAptitud catalogoAptitud, Oferta oferta) {
       this.pkAptitudOferta = pkAptitudOferta;
       this.catalogoAptitud = catalogoAptitud;
       this.oferta = oferta;
    }
   
    public BigDecimal getPkAptitudOferta() {
        return this.pkAptitudOferta;
    }
    
    public void setPkAptitudOferta(BigDecimal pkAptitudOferta) {
        this.pkAptitudOferta = pkAptitudOferta;
    }
    public CatalogoAptitud getCatalogoAptitud() {
        return this.catalogoAptitud;
    }
    
    public void setCatalogoAptitud(CatalogoAptitud catalogoAptitud) {
        this.catalogoAptitud = catalogoAptitud;
    }
    public Oferta getOferta() {
        return this.oferta;
    }
    
    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }




}

