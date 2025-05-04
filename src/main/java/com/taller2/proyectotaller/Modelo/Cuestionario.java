package com.taller2.proyectotaller.Modelo;


public class Cuestionario {
    //Atributos
    private int id_Cuestionario;
    private String titulo;
    private String modalidad;
    
    //Constructor default
    public Cuestionario(){
    }
    //Constructor completo
    public Cuestionario(int id, String tit, String mod){
        this.id_Cuestionario = id;
        this.titulo = tit;
        this.modalidad = mod;
    }
    
    //Getters
    public int getIdCuestionario(){
        return this.id_Cuestionario;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getModalidad(){
        return this.modalidad;
    }
    
    //Setters
    public void setId(int id){
        this.id_Cuestionario = id;
    }
    public void setTitulo(String tit){
        this.titulo = tit;
    }
    public void setModalidad(String mod){
        this.modalidad = mod;
    }
}
