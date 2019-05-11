package com.bad.sbtel;
// Generated 05-11-2019 11:29:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * ExperienciaLaboral generated by hbm2java
 */
public class ExperienciaLaboral  implements java.io.Serializable {


     private BigDecimal pkExperienciaLaboral;
     private Cv cv;
     private CatalogoSectorEmpresa catalogoSectorEmpresa;
     private String nombreExpEmpresa;
     private String cargo;
     private Date periodoInicio;
     private Date periodoFin;
     private String descripcionFunciones;
     private String nombreContactoExp;
     private Long telefonoContactoExp;
     private String correoContactoExp;

    public ExperienciaLaboral() {
    }

	
    public ExperienciaLaboral(BigDecimal pkExperienciaLaboral, Cv cv, CatalogoSectorEmpresa catalogoSectorEmpresa, String nombreExpEmpresa, String cargo, Date periodoInicio, Date periodoFin, String descripcionFunciones) {
        this.pkExperienciaLaboral = pkExperienciaLaboral;
        this.cv = cv;
        this.catalogoSectorEmpresa = catalogoSectorEmpresa;
        this.nombreExpEmpresa = nombreExpEmpresa;
        this.cargo = cargo;
        this.periodoInicio = periodoInicio;
        this.periodoFin = periodoFin;
        this.descripcionFunciones = descripcionFunciones;
    }
    public ExperienciaLaboral(BigDecimal pkExperienciaLaboral, Cv cv, CatalogoSectorEmpresa catalogoSectorEmpresa, String nombreExpEmpresa, String cargo, Date periodoInicio, Date periodoFin, String descripcionFunciones, String nombreContactoExp, Long telefonoContactoExp, String correoContactoExp) {
       this.pkExperienciaLaboral = pkExperienciaLaboral;
       this.cv = cv;
       this.catalogoSectorEmpresa = catalogoSectorEmpresa;
       this.nombreExpEmpresa = nombreExpEmpresa;
       this.cargo = cargo;
       this.periodoInicio = periodoInicio;
       this.periodoFin = periodoFin;
       this.descripcionFunciones = descripcionFunciones;
       this.nombreContactoExp = nombreContactoExp;
       this.telefonoContactoExp = telefonoContactoExp;
       this.correoContactoExp = correoContactoExp;
    }
   
    public BigDecimal getPkExperienciaLaboral() {
        return this.pkExperienciaLaboral;
    }
    
    public void setPkExperienciaLaboral(BigDecimal pkExperienciaLaboral) {
        this.pkExperienciaLaboral = pkExperienciaLaboral;
    }
    public Cv getCv() {
        return this.cv;
    }
    
    public void setCv(Cv cv) {
        this.cv = cv;
    }
    public CatalogoSectorEmpresa getCatalogoSectorEmpresa() {
        return this.catalogoSectorEmpresa;
    }
    
    public void setCatalogoSectorEmpresa(CatalogoSectorEmpresa catalogoSectorEmpresa) {
        this.catalogoSectorEmpresa = catalogoSectorEmpresa;
    }
    public String getNombreExpEmpresa() {
        return this.nombreExpEmpresa;
    }
    
    public void setNombreExpEmpresa(String nombreExpEmpresa) {
        this.nombreExpEmpresa = nombreExpEmpresa;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Date getPeriodoInicio() {
        return this.periodoInicio;
    }
    
    public void setPeriodoInicio(Date periodoInicio) {
        this.periodoInicio = periodoInicio;
    }
    public Date getPeriodoFin() {
        return this.periodoFin;
    }
    
    public void setPeriodoFin(Date periodoFin) {
        this.periodoFin = periodoFin;
    }
    public String getDescripcionFunciones() {
        return this.descripcionFunciones;
    }
    
    public void setDescripcionFunciones(String descripcionFunciones) {
        this.descripcionFunciones = descripcionFunciones;
    }
    public String getNombreContactoExp() {
        return this.nombreContactoExp;
    }
    
    public void setNombreContactoExp(String nombreContactoExp) {
        this.nombreContactoExp = nombreContactoExp;
    }
    public Long getTelefonoContactoExp() {
        return this.telefonoContactoExp;
    }
    
    public void setTelefonoContactoExp(Long telefonoContactoExp) {
        this.telefonoContactoExp = telefonoContactoExp;
    }
    public String getCorreoContactoExp() {
        return this.correoContactoExp;
    }
    
    public void setCorreoContactoExp(String correoContactoExp) {
        this.correoContactoExp = correoContactoExp;
    }




}

