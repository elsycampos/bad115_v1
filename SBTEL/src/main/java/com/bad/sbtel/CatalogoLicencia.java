package com.bad.sbtel;
// Generated 05-11-2019 11:29:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * CatalogoLicencia generated by hbm2java
 */
public class CatalogoLicencia  implements java.io.Serializable {


     private BigDecimal pkCatalogoLicencia;
     private String nombreTipoLicencia;
     private Set<LicenciaOferta> licenciaOfertas = new HashSet<LicenciaOferta>(0);
     private Set<LicenciaCandidato> licenciaCandidatos = new HashSet<LicenciaCandidato>(0);

    public CatalogoLicencia() {
    }

	
    public CatalogoLicencia(BigDecimal pkCatalogoLicencia, String nombreTipoLicencia) {
        this.pkCatalogoLicencia = pkCatalogoLicencia;
        this.nombreTipoLicencia = nombreTipoLicencia;
    }
    public CatalogoLicencia(BigDecimal pkCatalogoLicencia, String nombreTipoLicencia, Set<LicenciaOferta> licenciaOfertas, Set<LicenciaCandidato> licenciaCandidatos) {
       this.pkCatalogoLicencia = pkCatalogoLicencia;
       this.nombreTipoLicencia = nombreTipoLicencia;
       this.licenciaOfertas = licenciaOfertas;
       this.licenciaCandidatos = licenciaCandidatos;
    }
   
    public BigDecimal getPkCatalogoLicencia() {
        return this.pkCatalogoLicencia;
    }
    
    public void setPkCatalogoLicencia(BigDecimal pkCatalogoLicencia) {
        this.pkCatalogoLicencia = pkCatalogoLicencia;
    }
    public String getNombreTipoLicencia() {
        return this.nombreTipoLicencia;
    }
    
    public void setNombreTipoLicencia(String nombreTipoLicencia) {
        this.nombreTipoLicencia = nombreTipoLicencia;
    }
    public Set<LicenciaOferta> getLicenciaOfertas() {
        return this.licenciaOfertas;
    }
    
    public void setLicenciaOfertas(Set<LicenciaOferta> licenciaOfertas) {
        this.licenciaOfertas = licenciaOfertas;
    }
    public Set<LicenciaCandidato> getLicenciaCandidatos() {
        return this.licenciaCandidatos;
    }
    
    public void setLicenciaCandidatos(Set<LicenciaCandidato> licenciaCandidatos) {
        this.licenciaCandidatos = licenciaCandidatos;
    }




}


