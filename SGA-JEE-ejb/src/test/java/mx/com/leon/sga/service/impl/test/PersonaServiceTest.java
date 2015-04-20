/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.leon.sga.service.impl.test;

import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;
import junit.framework.TestCase;
import mx.com.leon.sga.domain.Persona;
import mx.com.leon.sga.service.PersonaService;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Squall Leonhart
 */
public class PersonaServiceTest {

    private PersonaService personaService;

    @Before
    public void setUp() throws NamingException {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        //Context jndi = new InitialContext(); //Sólo con glassfish
        /*Hashtable<String, String> env = new Hashtable<String, String>();
         env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
         env.put(Context.PROVIDER_URL, "t3://localhost:7001");
         InitialContext initialContext = new InitialContext(env);*/

        /*Properties prop = new Properties();
        prop.setProperty(EJBContainer.MODULES, "jar");*/
        EJBContainer container = EJBContainer.createEJBContainer();

        Context context = container.getContext();
        System.out.println("Context: " + context);
        //Llamada a interface local
        personaService = 
                (PersonaService) context.lookup("java:global/classes/PersonaServiceImpl!mx.com.leon.sga.service.PersonaService");
                
    }

    @Test
    public void testEJBPersonaService() {
        System.out.println("Iniciando test EJB PersonaService");
        TestCase.assertTrue(personaService != null);
        TestCase.assertEquals(2, personaService.listPersona().size());
        System.out.println("El no. de personas es: " + personaService.listPersona().size());
        
        this.desplegarPersona(personaService.listPersona());
        System.out.println("Fin test EJB PersonaService");
    }
    
    public void desplegarPersona(List<Persona> listaPersona) {
        for (Persona persona : listaPersona) {
            System.out.println(persona);
        }
    }
}
