package com.bad.sbtel;
// Generated 05-11-2019 11:29:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Oferta generated by hbm2java
 */
public class Oferta  implements java.io.Serializable {


     private BigDecimal pkOferta;
     private Empresa empresa;
     private CatalogoPuesto catalogoPuesto;
     private Municipio municipio;
     private String descripcionOferta;
     private Integer salarioMinOferta;
     private Integer salarioMaxOferta;
     private Date fechaInicioOferta;
     private Date fechaFinOferta;
     private Set<HabilidadLinguisicaOferta> habilidadLinguisicaOfertas = new HashSet<HabilidadLinguisicaOferta>(0);
     private Set<HabilidadOferta> habilidadOfertas = new HashSet<HabilidadOferta>(0);
     private Set<LicenciaOferta> licenciaOfertas = new HashSet<LicenciaOferta>(0);
     private Set<AptitudOferta> aptitudOfertas = new HashSet<AptitudOferta>(0);
     private Set<ConocimientoAcademicos> conocimientoAcademicoses = new HashSet<ConocimientoAcademicos>(0);
     private Set<Postulacion> postulacions = new HashSet<Postulacion>(0);
     private Set<Prueba> pruebas = new HashSet<Prueba>(0);

    public Oferta() {
    }

	
    public Oferta(BigDecimal pkOferta, Empresa empresa, CatalogoPuesto catalogoPuesto, String descripcionOferta, Date fechaInicioOferta, Date fechaFinOferta) {
        this.pkOferta = pkOferta;
        this.empresa = empresa;
        this.catalogoPuesto = catalogoPuesto;
        this.descripcionOferta = descripcionOferta;
        this.fechaInicioOferta = fechaInicioOferta;
        this.fechaFinOferta = fechaFinOferta;
    }
    public Oferta(BigDecimal pkOferta, Empresa empresa, CatalogoPuesto catalogoPuesto, Municipio municipio, String descripcionOferta, Integer salarioMinOferta, Integer salarioMaxOferta, Date fechaInicioOferta, Date fechaFinOferta, Set<HabilidadLinguisicaOferta> habilidadLinguisicaOfertas, Set<HabilidadOferta> habilidadOfertas, Set<LicenciaOferta> licenciaOfertas, Set<AptitudOferta> aptitudOfertas, Set<ConocimientoAcademicos> conocimientoAcademicoses, Set<Postulacion> postulacions, Set<Prueba> pruebas) {
       this.pkOferta = pkOferta;
       this.empresa = empresa;
       this.catalogoPuesto = catalogoPuesto;
       this.municipio = municipio;
       this.descripcionOferta = descripcionOferta;
       this.salarioMinOferta = salarioMinOferta;
       this.salarioMaxOferta = salarioMaxOferta;
       this.fechaInicioOferta = fechaInicioOferta;
       this.fechaFinOferta = fechaFinOferta;
       this.habilidadLinguisicaOfertas = habilidadLinguisicaOfertas;
       this.habilidadOfertas = habilidadOfertas;
       this.licenciaOfertas = licenciaOfertas;
       this.aptitudOfertas = aptitudOfertas;
       this.conocimientoAcademicoses = conocimientoAcademicoses;
       this.postulacions = postulacions;
       this.pruebas = pruebas;
    }
   
    public BigDecimal getPkOferta() {
        return this.pkOferta;
    }
    
    public void setPkOferta(BigDecimal pkOferta) {
        this.pkOferta = pkOferta;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public CatalogoPuesto getCatalogoPuesto() {
        return this.catalogoPuesto;
    }
    
    public void setCatalogoPuesto(CatalogoPuesto catalogoPuesto) {
        this.catalogoPuesto = catalogoPuesto;
    }
    public Municipio getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    public String getDescripcionOferta() {
        return this.descripcionOferta;
    }
    
    public void setDescripcionOferta(String descripcionOferta) {
        this.descripcionOferta = descripcionOferta;
    }
    public Integer getSalarioMinOferta() {
        return this.salarioMinOferta;
    }
    
    public void setSalarioMinOferta(Integer salarioMinOferta) {
        this.salarioMinOferta = salarioMinOferta;
    }
    public Integer getSalarioMaxOferta() {
        return this.salarioMaxOferta;
    }
    
    public void setSalarioMaxOferta(Integer salarioMaxOferta) {
        this.salarioMaxOferta = salarioMaxOferta;
    }
    public Date getFechaInicioOferta() {
        return this.fechaInicioOferta;
    }
    
    public void setFechaInicioOferta(Date fechaInicioOferta) {
        this.fechaInicioOferta = fechaInicioOferta;
    }
    public Date getFechaFinOferta() {
        return this.fechaFinOferta;
    }
    
    public void setFechaFinOferta(Date fechaFinOferta) {
        this.fechaFinOferta = fechaFinOferta;
    }
    public Set<HabilidadLinguisicaOferta> getHabilidadLinguisicaOfertas() {
        return this.habilidadLinguisicaOfertas;
    }
    
    public void setHabilidadLinguisicaOfertas(Set<HabilidadLinguisicaOferta> habilidadLinguisicaOfertas) {
        this.habilidadLinguisicaOfertas = habilidadLinguisicaOfertas;
    }
    public Set<HabilidadOferta> getHabilidadOfertas() {
        return this.habilidadOfertas;
    }
    
    public void setHabilidadOfertas(Set<HabilidadOferta> habilidadOfertas) {
        this.habilidadOfertas = habilidadOfertas;
    }
    public Set<LicenciaOferta> getLicenciaOfertas() {
        return this.licenciaOfertas;
    }
    
    public void setLicenciaOfertas(Set<LicenciaOferta> licenciaOfertas) {
        this.licenciaOfertas = licenciaOfertas;
    }
    public Set<AptitudOferta> getAptitudOfertas() {
        return this.aptitudOfertas;
    }
    
    public void setAptitudOfertas(Set<AptitudOferta> aptitudOfertas) {
        this.aptitudOfertas = aptitudOfertas;
    }
    public Set<ConocimientoAcademicos> getConocimientoAcademicoses() {
        return this.conocimientoAcademicoses;
    }
    
    public void setConocimientoAcademicoses(Set<ConocimientoAcademicos> conocimientoAcademicoses) {
        this.conocimientoAcademicoses = conocimientoAcademicoses;
    }
    public Set<Postulacion> getPostulacions() {
        return this.postulacions;
    }
    
    public void setPostulacions(Set<Postulacion> postulacions) {
        this.postulacions = postulacions;
    }
    public Set<Prueba> getPruebas() {
        return this.pruebas;
    }
    
    public void setPruebas(Set<Prueba> pruebas) {
        this.pruebas = pruebas;
    }




}


