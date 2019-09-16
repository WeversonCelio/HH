/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.luzetc.hh;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author wever
 */
@Stateless
public class CadastroPessoaFisicaFacade extends AbstractFacade<CadastroPessoaFisica> {

    @PersistenceContext(unitName = "br.luzetc_HH_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CadastroPessoaFisicaFacade() {
        super(CadastroPessoaFisica.class);
    }
    
}
