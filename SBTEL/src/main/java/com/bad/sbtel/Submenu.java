package com.bad.sbtel;
// Generated 05-11-2019 11:29:44 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Submenu generated by hbm2java
 */
public class Submenu  implements java.io.Serializable {


     private BigDecimal pkSubmenu;
     private Menu menu;
     private String submenu;
     private String orden;
     private Set<RolSubmenu> rolSubmenus = new HashSet<RolSubmenu>(0);

    public Submenu() {
    }

	
    public Submenu(BigDecimal pkSubmenu, Menu menu, String submenu, String orden) {
        this.pkSubmenu = pkSubmenu;
        this.menu = menu;
        this.submenu = submenu;
        this.orden = orden;
    }
    public Submenu(BigDecimal pkSubmenu, Menu menu, String submenu, String orden, Set<RolSubmenu> rolSubmenus) {
       this.pkSubmenu = pkSubmenu;
       this.menu = menu;
       this.submenu = submenu;
       this.orden = orden;
       this.rolSubmenus = rolSubmenus;
    }
   
    public BigDecimal getPkSubmenu() {
        return this.pkSubmenu;
    }
    
    public void setPkSubmenu(BigDecimal pkSubmenu) {
        this.pkSubmenu = pkSubmenu;
    }
    public Menu getMenu() {
        return this.menu;
    }
    
    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    public String getSubmenu() {
        return this.submenu;
    }
    
    public void setSubmenu(String submenu) {
        this.submenu = submenu;
    }
    public String getOrden() {
        return this.orden;
    }
    
    public void setOrden(String orden) {
        this.orden = orden;
    }
    public Set<RolSubmenu> getRolSubmenus() {
        return this.rolSubmenus;
    }
    
    public void setRolSubmenus(Set<RolSubmenu> rolSubmenus) {
        this.rolSubmenus = rolSubmenus;
    }




}


