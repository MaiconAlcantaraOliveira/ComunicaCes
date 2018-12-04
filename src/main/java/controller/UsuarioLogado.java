/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import model.Usuario;

/**
 *
 * @author arthu
 */
@Named(value = "usuarioLogado")
@SessionScoped
public class UsuarioLogado implements Serializable {

    /**
     * Creates a new instance of UsuarioLogado
     */
    public UsuarioLogado() {
    }
    
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public boolean existe() {
        return usuario != null;
    }
    
    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "faces/login/Login.xhtml?faces-redirect=true";
    }
    
}
