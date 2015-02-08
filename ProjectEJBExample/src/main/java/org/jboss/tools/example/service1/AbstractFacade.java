/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jboss.tools.example.service1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
/**
 *
 * @author interoperabilidad
 */
public abstract class AbstractFacade<T> {
    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll() {
    	CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
    	CriteriaQuery<T> criteria = cb.createQuery(entityClass);
    	Root<T> root = criteria.from(entityClass);
    	criteria.select(root);
    	return getEntityManager().createQuery(criteria).getResultList();
    }

    public List<T> findRange(int[] range) {

    	CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
    	CriteriaQuery<T> criteria = cb.createQuery(entityClass);
    	Root<T> root = criteria.from(entityClass);
    	criteria.select(root);
    	Query query = getEntityManager().createQuery(criteria);
    	query.setMaxResults(range[1] - range[0] + 1);
    	query.setFirstResult(range[0]);
    	return query.getResultList();
    }

    public int count() {
        
        return findAll().size();
    }
    
}
