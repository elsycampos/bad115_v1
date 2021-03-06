package com.bad.sbtel;
// Generated 05-11-2019 11:29:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * CatalogoAptitud generated by hbm2java
 */
public class CatalogoAptitud  implements java.io.Serializable {


     private BigDecimal pkCatalogoAptitud;
     private String nombreAptitud;
     private Set<AptitudOferta> aptitudOfertas = new HashSet<AptitudOferta>(0);
     private Set<AptitudCv> aptitudCvs = new HashSet<AptitudCv>(0);

    public CatalogoAptitud() {
    }

	
    public CatalogoAptitud(BigDecimal pkCatalogoAptitud, String nombreAptitud) {
        this.pkCatalogoAptitud = pkCatalogoAptitud;
        this.nombreAptitud = nombreAptitud;
    }
    public CatalogoAptitud(BigDecimal pkCatalogoAptitud, String nombreAptitud, Set<AptitudOferta> aptitudOfertas, Set<AptitudCv> aptitudCvs) {
       this.pkCatalogoAptitud = pkCatalogoAptitud;
       this.nombreAptitud = nombreAptitud;
       this.aptitudOfertas = aptitudOfertas;
       this.aptitudCvs = aptitudCvs;
    }
   
    public BigDecimal getPkCatalogoAptitud() {
        return this.pkCatalogoAptitud;
    }
    
    public void setPkCatalogoAptitud(BigDecimal pkCatalogoAptitud) {
        this.pkCatalogoAptitud = pkCatalogoAptitud;
    }
    public String getNombreAptitud() {
        return this.nombreAptitud;
    }
    
    public void setNombreAptitud(String nombreAptitud) {
        this.nombreAptitud = nombreAptitud;
    }
    public Set<AptitudOferta> getAptitudOfertas() {
        return this.aptitudOfertas;
    }
    
    public void setAptitudOfertas(Set<AptitudOferta> aptitudOfertas) {
        this.aptitudOfertas = aptitudOfertas;
    }
    public Set<AptitudCv> getAptitudCvs() {
        return this.aptitudCvs;
    }
    
    public void setAptitudCvs(Set<AptitudCv> aptitudCvs) {
        this.aptitudCvs = aptitudCvs;
    }




}


