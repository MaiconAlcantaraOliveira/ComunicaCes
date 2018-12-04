/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import facade.UsuarioFacade;
import java.io.Serializable;
import java.util.Optional;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import model.Usuario;

/**
 *
 * @author arthu
 */
@Named(value = "login")
@ViewScoped
public class Login implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     * Creates a new instance of Login
     */
    
    @Inject
    private UsuarioLogado usuarioLogado;
    
    @Inject
    UsuarioFacade facade;
    
    private String nome, senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   
    public String login() {
        Optional<Usuario> usuario = facade.findByCredenciais(nome, senha);
        if (usuario.isPresent()) {
            this.usuarioLogado.setUsuario(usuario.get());
            return "index";
        }
             FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Falha  ao  Autenticar", "Usuário  ou  senha  inválido!");
             FacesContext.getCurrentInstance().addMessage(null, msg);
             return null;
  
    }
    
}
