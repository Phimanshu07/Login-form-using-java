/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Himanshu Prajapati
 */
public class My_CON {
    private static String servername="localhost";
    private static String username="root";
    private static String dbname="users_db";
    private static Integer portnumber=3306;
    private static String password="";
    public static Connection getConnection(){
        Connection cnx =null;
        
        MysqlDataSource datasource=new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try{
        cnx=datasource.getConnection();
        }
        catch(SQLException ex){
           Logger.getLogger("get connection -> "+ My_CON.class.getName()).log(Level.SEVERE,null,ex); 
        }
        return cnx;
    }
}
