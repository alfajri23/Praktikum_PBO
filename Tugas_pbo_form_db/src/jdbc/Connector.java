/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;
/**
 *
 * @author User
 */
public class Connector {
    String DBurl = "jdbc:mysql://localhost/form_pbo";
    String DBusername = "root";
    String DBpassword = "";
    
    Connection koneksi;
    Statement statement;
    //Statement statement;
    public Connector() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl,"root","");
            System.out.println("Koneksi Berhasil");
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println("Koneksi gagal");
        }
    }
}

