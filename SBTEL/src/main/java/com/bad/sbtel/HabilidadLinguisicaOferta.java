package com.bad.sbtel;
// Generated 05-11-2019 11:29:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * HabilidadLinguisicaOferta generated by hbm2java
 */
public class HabilidadLinguisicaOferta  implements java.io.Serializable {


     private BigDecimal pkHabilidadLinOf;
     private CatalogoIdioma catalogoIdioma;
     private CatalogoPonderacion catalogoPonderacion;
     private Oferta oferta;
     private BigDecimal pondConversacionOf;
     private BigDecimal pondEscuchaOf;
     private BigDecimal pondEscritoOf;
     private BigDecimal pondLecturaOf;

    public HabilidadLinguisicaOferta() {
    }

    public HabilidadLinguisicaOferta(BigDecimal pkHabilidadLinOf, CatalogoIdioma catalogoIdioma, CatalogoPonderacion catalogoPonderacion, Oferta oferta, BigDecimal pondConversacionOf, BigDecimal pondEscuchaOf, BigDecimal pondEscritoOf, BigDecimal pondLecturaOf) {
       this.pkHabilidadLinOf = pkHabilidadLinOf;
       this.catalogoIdioma = catalogoIdioma;
       this.catalogoPonderacion = catalogoPonderacion;
       this.oferta = oferta;
       this.pondConversacionOf = pondConversacionOf;
       this.pondEscuchaOf = pondEscuchaOf;
       this.pondEscritoOf = pondEscritoOf;
       this.pondLecturaOf = pondLecturaOf;
    }
   
    public BigDecimal getPkHabilidadLinOf() {
        return this.pkHabilidadLinOf;
    }
    
    public void setPkHabilidadLinOf(BigDecimal pkHabilidadLinOf) {
        this.pkHabilidadLinOf = pkHabilidadLinOf;
    }
    public CatalogoIdioma getCatalogoIdioma() {
        return this.catalogoIdioma;
    }
    
    public void setCatalogoIdioma(CatalogoIdioma catalogoIdioma) {
        this.catalogoIdioma = catalogoIdioma;
    }
    public CatalogoPonderacion getCatalogoPonderacion() {
        return this.catalogoPonderacion;
    }
    
    public void setCatalogoPonderacion(CatalogoPonderacion catalogoPonderacion) {
        this.catalogoPonderacion = catalogoPonderacion;
    }
    public Oferta getOferta() {
        return this.oferta;
    }
    
    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }
    public BigDecimal getPondConversacionOf() {
        return this.pondConversacionOf;
    }
    
    public void setPondConversacionOf(BigDecimal pondConversacionOf) {
        this.pondConversacionOf = pondConversacionOf;
    }
    public BigDecimal getPondEscuchaOf() {
        return this.pondEscuchaOf;
    }
    
    public void setPondEscuchaOf(BigDecimal pondEscuchaOf) {
        this.pondEscuchaOf = pondEscuchaOf;
    }
    public BigDecimal getPondEscritoOf() {
        return this.pondEscritoOf;
    }
    
    public void setPondEscritoOf(BigDecimal pondEscritoOf) {
        this.pondEscritoOf = pondEscritoOf;
    }
    public BigDecimal getPondLecturaOf() {
        return this.pondLecturaOf;
    }
    
    public void setPondLecturaOf(BigDecimal pondLecturaOf) {
        this.pondLecturaOf = pondLecturaOf;
    }




}


