
package com.taller2.proyectotaller.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:mariadb://localhost:3306/sistemaebi";
    private static final String USUARIO = "root";      // Reemplazá con tu usuario real
    private static final String CONTRASENA = "root"; // Reemplazá con tu contraseña real

    public static Connection conectar() {
        try {
            Connection conn = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión exitosa a MariaDB.");
            return conn;
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos:");
            e.printStackTrace();
            return null;
        }
    }
}
