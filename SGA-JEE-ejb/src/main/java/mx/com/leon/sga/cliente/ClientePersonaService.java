/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.leon.sga.cliente;

import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import mx.com.leon.sga.domain.Persona;
import mx.com.leon.sga.service.PersonaServiceRemote;

/**
 *
 * @author Squall Leonhart
 */
public class ClientePersonaService {

    public static void main(String[] args) {
        try {
            System.out.println("Iniciando llamada al EJB desde el cliente\n");
            //Context jndi = new InitialContext(); //Sólo con glassfish
            Hashtable<String, String> env = new Hashtable<String, String>();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
            env.put(Context.PROVIDER_URL, "t3://localhost:7001");
            InitialContext initialContext = new InitialContext(env);
            
            PersonaServiceRemote personaService
                    = (PersonaServiceRemote) initialContext.lookup("java:global/SGA-JEE-ear-1.0-SNAPSHOT/SGA-JEE-ejb-1.0-SNAPSHOT/PersonaServiceImpl!mx.com.leon.sga.service.PersonaServiceRemote");

            List<Persona> listPersona = personaService.listPersona();

            for (Persona persona : listPersona) {
                System.out.println(persona.toString());
            }

            System.out.println("Fin llamaa al EJB");
        } catch (NamingException ex) {
            Logger.getLogger(ClientePersonaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
