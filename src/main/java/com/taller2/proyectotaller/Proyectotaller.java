package com.taller2.proyectotaller;
import com.taller2.proyectotaller.Modelo.*;
import com.taller2.proyectotaller.DAO.ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Proyectotaller {

    public static void main(String[] args) {
        
        //probamos clase Usuario.
        Usuario user1 = new Usuario(1, "Fran", "Sagasti", "dsadsadsa", "Docente");
        System.out.println("Hola usuario: " + user1.getNombre());

        // Probar conexión a la base de datos
        Connection conexion = ConexionBD.conectar();
        
        //Si la conexion es exitosa (no es null) podemos hacer cosas.
        if (conexion != null) {
        }

        System.out.println("Hello World de taller 2!");
    }
}
