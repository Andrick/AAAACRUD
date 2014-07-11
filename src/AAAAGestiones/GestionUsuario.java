/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AAAAGestiones;

import AAAACapaDatos.AAAA_Conexionbd;
import AAAAClasesPojo.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Cyber_Jefrie_Principal
 */
public class GestionUsuario implements IGestion
{
    private Usuario usuario;
    Connection conectar;

    public GestionUsuario() 
    {
        
       ConexionBase();
    }
    public void ConexionBase()
    {
        try
        {
            usuario=new Usuario(0,"","","");
            AAAA_Conexionbd.setUsuario("root");
            AAAA_Conexionbd.setClave("");
            AAAA_Conexionbd.setCadenaConexion("jdbc:mysql://localhost/usuariodb");
            
        } 
        catch (Exception e) 
        {
            System.out.print(e.getMessage());
        }
    }
    public Usuario getUsuario() 
    {
        return usuario;
    }
    public void setUsuario(Usuario usuario) 
    {
        this.usuario = usuario;
    }
    @Override
    public void Nuevo() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void Insertar() throws SQLException 
    {
        try
        {
            AAAA_Conexionbd.getInstancia().conectar();
            AAAA_Conexionbd.getInstancia().ejecutar("insert into usuario (Nombre,Apellido,Cedula) values ('"+usuario.getNombre()+"','"+usuario.getApellido()+"','"+usuario.getCedula()+"')");           
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            AAAA_Conexionbd.getInstancia().desconectar();
        }
    }
    @Override
    public void Consultar() throws SQLException 
    {
        try
        {
            AAAA_Conexionbd.getInstancia().conectar();
            AAAA_Conexionbd.getInstancia().ejecutar("SELECT `Id`, `Nombre`, `Apellido`, `Cedula` FROM `usuario` WHERE Id="+usuario.getId());
        }
        catch(SQLException ex)
        {
            
        }
    }
    @Override
    public void Modificar() throws SQLException 
    {
       try
        {
            AAAA_Conexionbd.getInstancia().conectar();
            AAAA_Conexionbd.getInstancia().ejecutar("UPDATE `usuario` SET "
                    + "`nombre`='"+usuario.getNombre()+"',`apellido`='"+usuario.getApellido()+"',"
                    + "`cedula`='"+usuario.getCedula()+"' WHERE id="+usuario.getId());
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally{AAAA_Conexionbd.getInstancia().desconectar();}
    }
    
    @Override
    public void Eliminar() throws SQLException 
    { 
        try
        {
            AAAA_Conexionbd.getInstancia().conectar();
            AAAA_Conexionbd.getInstancia().ejecutar("delete  from usuario  where Id="+usuario.getId()+"" );
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            AAAA_Conexionbd.getInstancia().desconectar();
        }
    }
}
