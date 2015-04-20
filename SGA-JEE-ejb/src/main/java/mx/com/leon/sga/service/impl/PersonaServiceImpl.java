/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.leon.sga.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import mx.com.leon.sga.domain.Persona;
import mx.com.leon.sga.service.PersonaService;
import mx.com.leon.sga.service.PersonaServiceRemote;

/**
 *
 * @author Squall Leonhart
 */
@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {

    @Override
    public List<Persona> listPersona() {
        List<Persona> listPersonas = new ArrayList<Persona>();
        listPersonas.add(new Persona(1, "Leon", "Loire", "Leonahrt", "leonxleonhart@live.com.mx", "8888888"));
        listPersonas.add(new Persona(1, "Cloud", "Strife", "Strife2", "cloudxstrife@live.com.mx", "7777777"));

        return listPersonas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {

    }

    @Override
    public void modificarPersona(Persona persona) {

    }

    @Override
    public void eliminarPersona(Persona persona) {

    }

}
