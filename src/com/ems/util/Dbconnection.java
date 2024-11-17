package com.ems.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Dbconnection {
        public static Connection getConnection() {
        Connection conn = null;

        String dbhost = "jdbc:mysql://localhost:3306/empnet";
        String user = "root";
        String password = "";

        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn= DriverManager.getConnection(dbhost, user, password);
             
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("error in connection "+e);
        }
        System.out.println("=======db Connecting======");
        return conn;
    }   
}
