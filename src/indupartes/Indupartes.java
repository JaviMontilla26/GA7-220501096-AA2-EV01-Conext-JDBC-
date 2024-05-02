/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package indupartes;

/**
 *
 * @author Javi
 */
import java.sql.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
public class Indupartes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String usuario ="root";
        String password ="Kiny2620.";
        String url = "jdbc:mysql://localhost:3306/indupartes";
        Connection conexion;
        Statement statement;
        ResultSet rs;
        
       
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Indupartes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conexion = DriverManager.getConnection(url,usuario,password);
            statement = conexion.createStatement();
            statement.executeUpdate("INSERT INTO CLIENTES(IDCLIENTES, NOMBRE, TELEFONO, DIRECCION, ESTADO) VALUES('124','ABC','321','ABC1','AOI')");
            rs = statement.executeQuery("SELECT * FROM CLIENTES");
            rs.next();
            do {
                System.out.println(rs.getInt("IdClientes")+" :  "+rs.getString("Nombre"));  
            }while(rs.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(Indupartes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
}
