/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AAAAGestiones;

import java.sql.SQLException;

/**
 *
 * @author Cyber_Jefrie_Principal
 */
public interface IGestion 
{
    public void Nuevo();
    public void Insertar()throws SQLException;
    public void Consultar()throws SQLException;
    public void Modificar()throws SQLException;
    public void Eliminar()throws SQLException;
    
}
