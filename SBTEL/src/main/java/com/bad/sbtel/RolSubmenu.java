package com.bad.sbtel;
// Generated 05-11-2019 11:29:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * RolSubmenu generated by hbm2java
 */
public class RolSubmenu  implements java.io.Serializable {


     private BigDecimal idRolSubmenu;
     private Rol rol;
     private Submenu submenu;

    public RolSubmenu() {
    }

	
    public RolSubmenu(BigDecimal idRolSubmenu) {
        this.idRolSubmenu = idRolSubmenu;
    }
    public RolSubmenu(BigDecimal idRolSubmenu, Rol rol, Submenu submenu) {
       this.idRolSubmenu = idRolSubmenu;
       this.rol = rol;
       this.submenu = submenu;
    }
   
    public BigDecimal getIdRolSubmenu() {
        return this.idRolSubmenu;
    }
    
    public void setIdRolSubmenu(BigDecimal idRolSubmenu) {
        this.idRolSubmenu = idRolSubmenu;
    }
    public Rol getRol() {
        return this.rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public Submenu getSubmenu() {
        return this.submenu;
    }
    
    public void setSubmenu(Submenu submenu) {
        this.submenu = submenu;
    }




}


