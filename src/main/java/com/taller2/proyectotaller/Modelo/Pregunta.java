package com.taller2.proyectotaller.Modelo;

public class Pregunta {
    //Atributos
    private int id_Pregunta;
    private String enunciado;
    private int nivel; //Ver estos 4 tipos de datos
    private String tipo;
    private String respuestaCorrecta;
    private String tema;
    
    //Constructor default
    public Pregunta(){};
    public Pregunta(int id, String enun, int lvl, String tipo, String respuestaCorrecta, String tema){
        this.id_Pregunta = id;
        this.enunciado = enun;
        this.nivel = lvl;
        this.tipo = tipo;
        this.respuestaCorrecta = respuestaCorrecta;
        this.tema = tema;
    };
    
    //Getters
    public int getIdPregunta(){
        return this.id_Pregunta;
    }
    public String getEnunciado(){
        return this.enunciado;
    }
    public int getNivel(){
        return this.nivel;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getRespuestaCor(){
        return this.respuestaCorrecta;
    }
    public String getTema(){
        return this.tema;
    }
    // Setters
    public void setIdPregunta(int id_Pregunta) {
    this.id_Pregunta = id_Pregunta;
    }

    public void setEnunciado(String enunciado) {
    this.enunciado = enunciado;
    }

    public void setNivel(int nivel) {
    this.nivel = nivel;
    }

    public void setTipo(String tipo) {
    this.tipo = tipo;
    }

    public void setRespuestaCor(String respuestaCorrecta) {
    this.respuestaCorrecta = respuestaCorrecta;
    }

    public void setTema(String tema) {
    this.tema = tema;
    }

    
    
}
