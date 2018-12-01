/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Foto;

/**
 *
 * @author Gustavo Ruhena
 */
@Stateless
public class FotoFacade extends AbstractFacade<Foto> {

    @PersistenceContext(unitName = "com.mycompany_ComunicaCes_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FotoFacade() {
        super(Foto.class);
    }
    
}
