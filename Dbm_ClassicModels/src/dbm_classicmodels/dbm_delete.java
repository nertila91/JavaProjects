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


