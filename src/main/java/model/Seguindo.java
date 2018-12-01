/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gustavo Ruhena
 */
@Entity
@Table(name = "seguindo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seguindo.findAll", query = "SELECT s FROM Seguindo s")
    , @NamedQuery(name = "Seguindo.findById", query = "SELECT s FROM Seguindo s WHERE s.id = :id")
    , @NamedQuery(name = "Seguindo.findByIdUsuarioSeguido", query = "SELECT s FROM Seguindo s WHERE s.idUsuarioSeguido = :idUsuarioSeguido")})
public class Seguindo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_usuario_seguido")
    private Integer idUsuarioSeguido;
    @JoinColumn(name = "id_usuario_seguidor", referencedColumnName = "ID")
    @ManyToOne
    private Usuario idUsuarioSeguidor;

    public Seguindo() {
    }

    public Seguindo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuarioSeguido() {
        return idUsuarioSeguido;
    }

    public void setIdUsuarioSeguido(Integer idUsuarioSeguido) {
        this.idUsuarioSeguido = idUsuarioSeguido;
    }

    public Usuario getIdUsuarioSeguidor() {
        return idUsuarioSeguidor;
    }

    public void setIdUsuarioSeguidor(Usuario idUsuarioSeguidor) {
        this.idUsuarioSeguidor = idUsuarioSeguidor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seguindo)) {
            return false;
        }
        Seguindo other = (Seguindo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Seguindo[ id=" + id + " ]";
    }
    
}
