/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Gerencia a conexão com o banco de dados. Possui as instruções
 * para conectar ao banco.
 * @author devsys-b
 */
public class MySQLConnection {
    //Define strings de conexão com os bancos.
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://172.16.0.30:3306/yls_dukemarket";
    private static final String USER = "yasminl";
    private static final String PASS = "21262820";
    
    public static Connection getConnection(){
       
        try {
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro na Conexão com o BD. Verifique!", ex);
        }
    }
    
    public static void closeConnection(Connection conn) {
       
        try {
                if (conn != null) {
                    conn.close();
                }
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void closeConnection(Connection conn, PreparedStatement stmt) {
        closeConnection(conn);
        
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void closeConnection(Connection conn, PreparedStatement stmt,ResultSet rs) {
        closeConnection(conn,stmt);
        try {
            if (rs != null) {
                 rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(
            MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
}
    
    