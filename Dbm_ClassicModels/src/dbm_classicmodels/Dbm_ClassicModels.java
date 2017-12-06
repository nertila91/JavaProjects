package dbm_classicmodels;

import java.sql.*;

public class Dbm_ClassicModels{
// JDBC driver dhe database URL
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://localhost/";
// Kredencialet ne database
static final String USER = "nertila";
static final String PASS = "nertila";
public static void main(String[] args) {
 Connection conn = null;
 Statement stmt = null;
try{
 // Registrimi i JDBC drive
 Class.forName("com.mysql.jdbc.Driver");
 // Krijimi i connection
 System.out.println("Lidhja me database...");
 conn = DriverManager.getConnection(DB_URL, USER, PASS);
 //Ekzekutimi i query
 System.out.println("Krijimi i database...");
 stmt = conn.createStatement();

 String sql = "CREATE DATABASE classicmodels";
 stmt.executeUpdate(sql);
 System.out.println("Database u krijua me sukses...");
 }catch(SQLException se){
 //Trajtimi i perjashtimit te JDBC
 se.printStackTrace();
 }catch(Exception e){
 //Trajtimi i perjashtimit te Class.forName
 e.printStackTrace();
 }finally{
 //blloku finally qe mbyll resurset
 try{
 if(stmt!=null)
 stmt.close();
 }catch(SQLException se2){
 }

 }
 System.out.println("Dalje....");
}
}



        
      


