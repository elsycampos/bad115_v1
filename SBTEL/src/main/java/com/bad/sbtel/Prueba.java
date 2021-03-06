package com.bad.sbtel;
// Generated 05-11-2019 11:29:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Prueba generated by hbm2java
 */
public class Prueba  implements java.io.Serializable {


     private BigDecimal pkPrueba;
     private CatalogoTipoPrueba catalogoTipoPrueba;
     private Oferta oferta;
     private String nombrePrueba;
     private Set<ItemPrueba> itemPruebas = new HashSet<ItemPrueba>(0);
     private Set<Resultado> resultados = new HashSet<Resultado>(0);

    public Prueba() {
    }

	
    public Prueba(BigDecimal pkPrueba, CatalogoTipoPrueba catalogoTipoPrueba, Oferta oferta, String nombrePrueba) {
        this.pkPrueba = pkPrueba;
        this.catalogoTipoPrueba = catalogoTipoPrueba;
        this.oferta = oferta;
        this.nombrePrueba = nombrePrueba;
    }
    public Prueba(BigDecimal pkPrueba, CatalogoTipoPrueba catalogoTipoPrueba, Oferta oferta, String nombrePrueba, Set<ItemPrueba> itemPruebas, Set<Resultado> resultados) {
       this.pkPrueba = pkPrueba;
       this.catalogoTipoPrueba = catalogoTipoPrueba;
       this.oferta = oferta;
       this.nombrePrueba = nombrePrueba;
       this.itemPruebas = itemPruebas;
       this.resultados = resultados;
    }
   
    public BigDecimal getPkPrueba() {
        return this.pkPrueba;
    }
    
    public void setPkPrueba(BigDecimal pkPrueba) {
        this.pkPrueba = pkPrueba;
    }
    public CatalogoTipoPrueba getCatalogoTipoPrueba() {
        return this.catalogoTipoPrueba;
    }
    
    public void setCatalogoTipoPrueba(CatalogoTipoPrueba catalogoTipoPrueba) {
        this.catalogoTipoPrueba = catalogoTipoPrueba;
    }
    public Oferta getOferta() {
        return this.oferta;
    }
    
    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }
    public String getNombrePrueba() {
        return this.nombrePrueba;
    }
    
    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }
    public Set<ItemPrueba> getItemPruebas() {
        return this.itemPruebas;
    }
    
    public void setItemPruebas(Set<ItemPrueba> itemPruebas) {
        this.itemPruebas = itemPruebas;
    }
    public Set<Resultado> getResultados() {
        return this.resultados;
    }
    
    public void setResultados(Set<Resultado> resultados) {
        this.resultados = resultados;
    }




}


