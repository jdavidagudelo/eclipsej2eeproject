package org.jboss.tools.example.test1;

import java.util.Properties;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;
import javax.inject.Inject;
import javax.naming.Context;

import org.apache.openejb.api.LocalClient;
import org.jboss.tools.example.service1.ConceptService;
import org.junit.Before;
import org.junit.Test;
@LocalClient
public class ConceptServiceTest {

	private Context context;
	/**
	 * This method is called every time
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		Properties props = new Properties();
		props.setProperty(Context.INITIAL_CONTEXT_FACTORY,
				"org.apache.openejb.client.LocalInitialContextFactory");
        props.put("postgresql", "new://Resource?type=DataSource");
		props.put("postgresql.JtaManaged", "true");
		props.put("postgresql.JdbcDriver", "org.postgresql.Driver");
		props.put("postgresql.JdbcUrl", "jdbc:postgresql://172.21.0.181:5432/rcmedicalrecordtph");
		props.put("postgresql.username", "tph_user");
		props.put("postgresql.password", "4dm!n/tph");
		// TODO fix properties hibernate.hbm2ddl.auto=create-drop
		context =EJBContainer.createEJBContainer(props).getContext();
		context.bind("inject", this);
	}
	
	@EJB
	ConceptService conceptService;

	@Inject
	Logger log;

	@Test
	public void test() {
		System.out.println(conceptService.getAll().size());
	}

}
