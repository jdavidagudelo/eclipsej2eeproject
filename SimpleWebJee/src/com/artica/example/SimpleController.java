package com.artica.example;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.jboss.tools.example.service.ConceptService;
@ManagedBean(name = "simpleController", eager = true)
@RequestScoped
public class SimpleController {
	@EJB
	private ConceptService conceptService;
	public SimpleController()
	{
	}
	private String text = "Some text";
	public String getText()
	{
		conceptService.getAll();
		return text;
	}
}
