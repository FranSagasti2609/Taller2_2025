package com.taller2.proyectotaller.Modelo;

public class Grupo {
    //Atributos
    private int id_Grupo;
    private String nombre;
    
    //Constructor default
    public Grupo(){}
    public Grupo(int id, String nom){
        this.id_Grupo = id;
        this.nombre = nom;
    }
    
    //Getters
    public int getIdGrupo(){
        return this.id_Grupo;
    }
    public String getNombreGrupo(){
        return this.nombre;
    }
    
    //Setters
    public void setId(int id){
        this.id_Grupo = id;
    }
    public void setNombre(String nom){
        this.nombre =nom;
    }
}
