/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.leon.sga.service;

import java.util.List;
import javax.ejb.Remote;
import mx.com.leon.sga.domain.Persona;

/**
 *
 * @author Squall Leonhart
 */
@Remote
public interface PersonaServiceRemote {
    List<Persona> listPersona();
    public Persona encontrarPersonaPorId(Persona persona);
    public Persona encontrarPersonaPorEmail(Persona persona);
    void registrarPersona(Persona persona);
    void modificarPersona(Persona persona);
    void eliminarPersona(Persona persona);
}
