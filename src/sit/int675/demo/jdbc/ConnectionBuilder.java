/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.jdbc.ClientDataSource;

/**
 *
 * @author INT675
 */
public class ConnectionBuilder {

    private static String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    private static String URL = "jdbc:derby://localhost:1527/sample";
    private static String USER = "app";
    private static String PASWORD = "app";

    private static boolean isLoaded = false;

    static Connection getConnection() {
        Connection conn = null ;
        try {
            if (!isLoaded) {
                Class.forName(DRIVER);
                isLoaded = true;
            }
            conn = DriverManager.getConnection(URL, USER, PASWORD);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        } catch (SQLException ex) {
            System.err.println(ex);
        }

        return  conn ;
    }

    static Connection getConnectionDs() throws FileNotFoundException, IOException, SQLException {
        Properties props = new Properties();
        FileInputStream fis = null;

        fis = new FileInputStream("dbconfig.properties");
        props.load(fis);
        ClientDataSource ds = new ClientDataSource();

        ds.setServerName(props.getProperty("DB_SERVER_NAME").trim());

        ds.setPortNumber(Integer.parseInt(props.getProperty("DB_SERVER_PORT").trim()));
        ds.setDatabaseName(props.getProperty("DB_DATABASE_NAME").trim());
        ds.setUser(props.getProperty("DB_USERNAME").trim());
        ds.setPassword(props.getProperty("DB_PASSWORD").trim());

        Connection conn = ds.getConnection();

        return conn;
    }

    public static void main(String[] args) throws IOException, FileNotFoundException, SQLException {
        Connection conn = getConnectionDs();
        conn.close();
    }
}
