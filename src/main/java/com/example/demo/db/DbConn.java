package com.example.demo.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DbConn {

    @Autowired
    private DataSource dataSource;

    public void getConnection() throws SQLException{
        Connection connection = dataSource.getConnection();
        String url = connection.getMetaData().getURL();
        String userName = connection.getMetaData().getUserName();
        
        System.out.print(url);
        System.out.print(userName);
        
    }
    
}
