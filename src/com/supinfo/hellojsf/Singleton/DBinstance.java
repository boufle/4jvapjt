package com.supinfo.hellojsf.Singleton;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;

public class DBinstance{
    private String url = "jdbc:mysql://localhost:3306/pjt4jvadb";
    private String user = "root";
    private String passwd = "";
    private static Connection connect;

    InitialContext ctx;
    DataSource ds;
    Connection conn;

    private DBinstance(){
        try {
            ds = (DataSource) new InitialContext().lookup("jdbc/__pjt4jvadb");
            connect = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public static Connection getInstance(){
        if(connect == null){
            new DBinstance();
        }
        int i = 0;
        return connect;
    }
}