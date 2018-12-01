/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Seguindo;

/**
 *
 * @author Gustavo Ruhena
 */
@Stateless
public class SeguindoFacade extends AbstractFacade<Seguindo> {

    @PersistenceContext(unitName = "com.mycompany_ComunicaCes_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SeguindoFacade() {
        super(Seguindo.class);
    }
    
}
