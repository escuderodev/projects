package br.com.escuderodev.cadastro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection connectToBD() {
        String database = "kfeitariafit";
        String user = "root";
        String password = "1403";

        String url = "jdbc:mysql://localhost:3306/"+database+"?user="+user+"&password="+password+"";
        try {
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
