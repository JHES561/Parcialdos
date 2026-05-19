package com.mycompany.parcialdos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rever
 */
public class Nodo {
    int  id;
    String sensorID, tipo;
    double valor;
    int prioridad;
    long  timesTamp;
    Nodo sig;
    Nodo ant;
    
    public Nodo(int id, String sID, String t, float v, int p ){
        this.id = id;
        this.sensorID = sID;
        this.tipo = t;
        this.valor = v;
        this.prioridad= p;
        this.timesTamp = System.currentTimeMillis(); 
        this.sig = null;
        this.ant = null;
    }
    
}
