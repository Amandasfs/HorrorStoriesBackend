/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author amand
 */
public class UserDAO {
   private static final String REGISTER_USER = "INSERT INTO public.user(id, birthDate, userName, password, email)VALUES(?,?,?,?,?);";
   
   public User RegisterUser(User newuser) throws ClassNotFoundException{
       Connection conn = null;
        ResultSet rs = null;
       try {
           conn = connect.DB.getConnection();
      
           User  obj = new User();
           obj.setIdUser(rs.getInt("IdUser"));
           obj.setUserName(rs.getString("UserName"));
           obj.setEmail(rs.getString("Email"));
           obj.setBirthDate(rs.getInt("BirthDate"));
           obj.setPassword(rs.getString("Password"));
           return obj;
       } catch (SQLException sqlErro) {
            throw new RuntimeException(sqlErro);
       } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
       }

   }
}
