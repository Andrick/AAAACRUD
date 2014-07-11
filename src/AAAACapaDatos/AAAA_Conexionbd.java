/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AAAACapaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author Cyber_Jefrie_Principal
 */
public class AAAA_Conexionbd 
{
    public Connection conectar = null;
    public PreparedStatement sentencia=null;
    public ResultSet resultado=null;
    public static AAAA_Conexionbd instancia;
    
    public static AAAA_Conexionbd getInstancia()
    {
        if (instancia==null)
        {
            instancia=new AAAA_Conexionbd();
        }
        return instancia;
    }
    private static String usuario;
    private static String clave;
    private static String cadenaConexion;

    public static String getUsuario() 
    {
        return usuario;
    }
    public static void setUsuario(String usuario) 
    {
        AAAA_Conexionbd.usuario = usuario;
    }
    public static String getClave() 
    {
        return clave;
    }
    public static void setClave(String clave) 
    {
        AAAA_Conexionbd.clave = clave;
    }
    public static String getCadenaConexion() 
    {
        return cadenaConexion;
    }
    public static void setCadenaConexion(String cadenaConexion) 
    {
        AAAA_Conexionbd.cadenaConexion = cadenaConexion;
    }
    public AAAA_Conexionbd() 
    {
        
    }
    public void conectar()
    {
        try 
        {
            conectar = DriverManager.getConnection(cadenaConexion, usuario, clave);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(AAAA_Conexionbd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void desconectar()
    {
        try {
            conectar.close();
        } catch (SQLException ex) {
            Logger.getLogger(AAAA_Conexionbd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ejecutar(String cadenaSql)throws SQLException
    {
        try {
            sentencia=conectar.prepareStatement(cadenaSql);
            sentencia.executeUpdate();
        } catch (SQLException ex) {
           throw ex;
        }
    }
}
