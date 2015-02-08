package org.jboss.tools.example.service1;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import model.Concept;
@Stateless(name="ConceptService")
public class ConceptService {
	@PersistenceContext(unitName = "ProjectJPA")
	private EntityManager em;
	/**
	 * Allow you to get all concepts from the database.
	 * @return list of concepts from the database.
	 */
	public List<Concept> getAll()
	{
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Concept> criteria = cb.createQuery(Concept.class);
		Root<Concept> root = criteria.from(Concept.class);
		criteria.select(root);
		return em.createQuery(criteria).getResultList();
	}
	public Integer count()
	{
		return getAll().size();
	}
}
