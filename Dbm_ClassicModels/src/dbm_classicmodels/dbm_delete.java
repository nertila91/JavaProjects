/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbm_classicmodels;
import java.sql.*;
/**
 *
 * @author User
 */
public class dbm_delete {
	Connection connection = null;
	Statement stmt = null
	public dbm_delete(Connection conn){
		connection = conn;
	}
	public void executeUpdate(String sql) throws SQLException{
		stmt.executeUpdate(sql);
		stmt = connection.createStatement();
		reloadTables();
		
	}
	   
    private void DeleteOrderDetailsActionPerformed(String orderNumber, String productCode) {
		try { 
		executeUpdate("DELETE FROM orderdetails WHERE orderNumber='" + orderNumber + "' 
		 		AND productCode='"+productCode+"'");
		}
		catch (SQLException e) {
		e.printStackTrace();
    }
}
}


