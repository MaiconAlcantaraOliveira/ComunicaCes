/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.Optional;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import model.Usuario;

/**
 *
 * @author Gustavo Ruhena
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "com.mycompany_ComunicaCes_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    public Optional<Usuario> findByCredenciais(String nome, String senha) {
        TypedQuery<Usuario> query = em.createNamedQuery("Usuario.buscaPorCredenciais", Usuario.class);
        query.setParameter("nome", nome);
        query.setParameter("senha", senha/*Hash.md5(senha)*/);
        String q = query.toString();
        try {
            return Optional.of(query.getSingleResult());
        } catch (NonUniqueResultException | NoResultException e) {
            return Optional.empty();
        }
    }
}
