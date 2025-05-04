package com.taller2.proyectotaller.Modelo;

public class Usuario {
   //Declaramos atributos
    private int cedula;
    private String nombre;
    private String apellido; 
    private String contrasenia;
    private String rol;
    
    //Constructor default
    public Usuario(){}
    
    //Constructor completo
    public Usuario(int ci, String nom, String ape, String contra, String rol){
        this.cedula = ci;
        this.nombre = nom;
        this.apellido = ape;
        this.contrasenia = contra;
        this.rol = rol;
    }
    
    //Getters de la clase
 
    public int getCedula(){
        return this.cedula;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getContrasenia(){
        return this.contrasenia;
    }
    public String getRol(){
        return this.rol;
    }
    //Setters
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
