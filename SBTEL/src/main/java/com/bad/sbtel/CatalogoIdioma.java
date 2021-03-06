package com.bad.sbtel;
// Generated 05-11-2019 11:29:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * CatalogoIdioma generated by hbm2java
 */
public class CatalogoIdioma  implements java.io.Serializable {


     private BigDecimal pkIdioma;
     private String nombreIdioma;
     private Set<HabilidadLinguisicaOferta> habilidadLinguisicaOfertas = new HashSet<HabilidadLinguisicaOferta>(0);
     private Set<HabilidadLinguisticaCv> habilidadLinguisticaCvs = new HashSet<HabilidadLinguisticaCv>(0);

    public CatalogoIdioma() {
    }

	
    public CatalogoIdioma(BigDecimal pkIdioma, String nombreIdioma) {
        this.pkIdioma = pkIdioma;
        this.nombreIdioma = nombreIdioma;
    }
    public CatalogoIdioma(BigDecimal pkIdioma, String nombreIdioma, Set<HabilidadLinguisicaOferta> habilidadLinguisicaOfertas, Set<HabilidadLinguisticaCv> habilidadLinguisticaCvs) {
       this.pkIdioma = pkIdioma;
       this.nombreIdioma = nombreIdioma;
       this.habilidadLinguisicaOfertas = habilidadLinguisicaOfertas;
       this.habilidadLinguisticaCvs = habilidadLinguisticaCvs;
    }
   
    public BigDecimal getPkIdioma() {
        return this.pkIdioma;
    }
    
    public void setPkIdioma(BigDecimal pkIdioma) {
        this.pkIdioma = pkIdioma;
    }
    public String getNombreIdioma() {
        return this.nombreIdioma;
    }
    
    public void setNombreIdioma(String nombreIdioma) {
        this.nombreIdioma = nombreIdioma;
    }
    public Set<HabilidadLinguisicaOferta> getHabilidadLinguisicaOfertas() {
        return this.habilidadLinguisicaOfertas;
    }
    
    public void setHabilidadLinguisicaOfertas(Set<HabilidadLinguisicaOferta> habilidadLinguisicaOfertas) {
        this.habilidadLinguisicaOfertas = habilidadLinguisicaOfertas;
    }
    public Set<HabilidadLinguisticaCv> getHabilidadLinguisticaCvs() {
        return this.habilidadLinguisticaCvs;
    }
    
    public void setHabilidadLinguisticaCvs(Set<HabilidadLinguisticaCv> habilidadLinguisticaCvs) {
        this.habilidadLinguisticaCvs = habilidadLinguisticaCvs;
    }




}


