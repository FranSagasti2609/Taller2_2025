package com.taller2.proyectotaller.Modelo;

public class Respuesta {
    //Atributos
    private int id_Respuesta;
    private String RespuestaDada;
    private boolean esCorrecta;
    
    //Constructores
    public Respuesta(){}
    public Respuesta(int id, String respDada, boolean esC){
        this.id_Respuesta = id;
        this.RespuestaDada = respDada;
        this.esCorrecta = esC;
    }
    
    // Getters
    public int getIdRespuesta() {
        return this.id_Respuesta;
    }

    public String getRespuestaDada() {
        return this.RespuestaDada;
    }

    public boolean isEsCorrecta() {
        return this.esCorrecta;
    }

    // Setters
    public void setIdRespuesta(int id_Respuesta) {
        this.id_Respuesta = id_Respuesta;
    }

    public void setRespuestaDada(String respuestaDada) {
        this.RespuestaDada = respuestaDada;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }
}
