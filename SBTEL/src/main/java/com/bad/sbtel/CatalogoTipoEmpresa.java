package com.bad.sbtel;
// Generated 05-11-2019 11:29:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * CatalogoTipoEmpresa generated by hbm2java
 */
public class CatalogoTipoEmpresa  implements java.io.Serializable {


     private BigDecimal pkTipoEmpresa;
     private String nombreTipoEmpresa;
     private Set<Empresa> empresas = new HashSet<Empresa>(0);

    public CatalogoTipoEmpresa() {
    }

	
    public CatalogoTipoEmpresa(BigDecimal pkTipoEmpresa, String nombreTipoEmpresa) {
        this.pkTipoEmpresa = pkTipoEmpresa;
        this.nombreTipoEmpresa = nombreTipoEmpresa;
    }
    public CatalogoTipoEmpresa(BigDecimal pkTipoEmpresa, String nombreTipoEmpresa, Set<Empresa> empresas) {
       this.pkTipoEmpresa = pkTipoEmpresa;
       this.nombreTipoEmpresa = nombreTipoEmpresa;
       this.empresas = empresas;
    }
   
    public BigDecimal getPkTipoEmpresa() {
        return this.pkTipoEmpresa;
    }
    
    public void setPkTipoEmpresa(BigDecimal pkTipoEmpresa) {
        this.pkTipoEmpresa = pkTipoEmpresa;
    }
    public String getNombreTipoEmpresa() {
        return this.nombreTipoEmpresa;
    }
    
    public void setNombreTipoEmpresa(String nombreTipoEmpresa) {
        this.nombreTipoEmpresa = nombreTipoEmpresa;
    }
    public Set<Empresa> getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Set<Empresa> empresas) {
        this.empresas = empresas;
    }




}


