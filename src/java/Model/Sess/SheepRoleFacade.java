/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Sess;

import Model.Entity.SheepRole;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DTT
 */
@Stateless
public class SheepRoleFacade extends AbstractFacade<SheepRole> implements SheepRoleFacadeLocal {
    @PersistenceContext(unitName = "TheSHEEPPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SheepRoleFacade() {
        super(SheepRole.class);
    }
    
}
