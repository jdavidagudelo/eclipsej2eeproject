/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jboss.tools.example.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Concept;

/**
 *
 * @author interoperabilidad
 */
@Stateless
public class ConceptFacade extends AbstractFacade<Concept> {
    @PersistenceContext(unitName = "ProjectJPA")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConceptFacade() {
        super(Concept.class);
    }
    
}
