/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserCRUD {
    
    private Connection conexion;
    
    //Constructor de la clase arranca la conexion a BD
    public UserCRUD(){
        conexion = ConexionMySQL.conectar();
    }
    
    //Preparamos la sentencia SQL para INSERT 
    public boolean InsertarUsuario(String Nombre, String Correo, String Contra){
        String insertSQL= "INSERT INTO usuarios(Nombre,Correo,Contrasena) VALUES (?,?,?)";
        
        try{
            //Asignamos la sentencia y parametros para su ejecucion 
            PreparedStatement ps = conexion.prepareStatement(insertSQL);
            ps.setString(1, Nombre);
            ps.setString(2, Correo);
            ps.setString(3, Contra);
            return ps.executeUpdate()>0;
        }
        //Imprimimos en consola en caso de que no se ejecute el INSERT           
        catch(SQLException e){              //Excepcion sin ver el usuario
            System.out.println("Error al crear el usuario " +e.getMessage());
            return false;
            
        }
    }           //fin del insert 
    
    //Metodo para Consultar por ID

    /**
     *
     * @param id
     * @return
     */
    public ResultSet buscarPorID(int id){
        String sqlBuscar="SELECT * FROM usuarios WHERE idusuarios= ?";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlBuscar);
            ps.setInt(1,id);
            return ps.executeQuery();
                    
        }
        catch(SQLException e){
            System.out.println("Error al buscar por Id " +e.getMessage());
            return null;
        }
    }   //fin del consulta ID
  
    public ResultSet obtenerTodos(){
        
        String sqlTodos="SELECT * FROM usuarios";
        
        try{
            PreparedStatement ps= conexion.prepareStatement(sqlTodos);
            return ps.executeQuery();
        }
        catch(SQLException s){
            System.out.println("Error al consultar todos"+s.getMessage());
            return null;
        }
        
    }//fin de obtener ttodos
    
   public ResultSet buscarPorId(int idusuarios) {
    String sql = "SELECT * FROM usuarios WHERE idusuarios = ?";
    try (PreparedStatement ps = conexion.prepareStatement(sql)) {
        ps.setInt(1, idusuarios);
        return ps.executeQuery();
    } catch (SQLException e) {
        System.out.println("Error al buscar usuario: " + e.getMessage());
        return null;
    }
}
    
}
