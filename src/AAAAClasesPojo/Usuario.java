/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AAAAClasesPojo;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author Cyber_Jefrie_Principal
 */
public class Usuario 
{
    public Usuario(int Id, String Nombre, String Apellido, String Cedula) 
    {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
    }
    private int Id;
    private String Nombre;
    private String Apellido;
    private String Cedula;

    public int getId() 
    {
        return Id;
    }
    public void setId(int Id) 
    {
        this.Id = Id;
    }
    public String getNombre() 
    {
        return Nombre;
    }
    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }
    public String getApellido() 
    {
        return Apellido;
    }
    public void setApellido(String Apellido) 
    {
        this.Apellido = Apellido;
    }    
    public String getCedula() 
    {
        return Cedula;
    }
    public void setCedula(String Cedula) 
    {
        this.Cedula = Cedula;
    }
}
