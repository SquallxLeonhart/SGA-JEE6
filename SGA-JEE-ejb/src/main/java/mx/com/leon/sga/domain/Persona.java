/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.com.leon.sga.domain;

import java.io.Serializable;

/**
 *
 * @author Squall Leonhart
 */
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idPersona;
    private String nombre;
    private String apelPaterno;
    private String apeMaterno;
    private String email;
    private String telefono;

    public Persona() {
    }
        
    public Persona(int idPersona, String nombre, String apelPaterno, String apeMaterno, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apelPaterno = apelPaterno;
        this.apeMaterno = apeMaterno;
        this.email = email;
        this.telefono = telefono;
    }

    /**
     * @return the idPersona
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apelPaterno
     */
    public String getApelPaterno() {
        return apelPaterno;
    }

    /**
     * @param apelPaterno the apelPaterno to set
     */
    public void setApelPaterno(String apelPaterno) {
        this.apelPaterno = apelPaterno;
    }

    /**
     * @return the apeMaterno
     */
    public String getApeMaterno() {
        return apeMaterno;
    }

    /**
     * @param apeMaterno the apeMaterno to set
     */
    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apelPaterno=" + apelPaterno + ", apeMaterno=" + apeMaterno + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
    
}
