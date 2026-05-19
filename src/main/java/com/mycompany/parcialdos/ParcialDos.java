package com.mycompany.parcialdos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author rever
 */
public class ParcialDos {
    Nodo incio = null;
    Nodo fin = null;
 int contador = 0;   
 public void eliminarPrimero() {
    if (incio != null) {
        if (incio == fin) {
            incio = fin = null;
        } else {
            incio = incio.sig; 
            incio.ant = null;  
        }
        contador--; 
    }
}
 public void insertar(Nodo nuevo){
     
     if (contador>= 100){
         eliminarPrimero();
     }
     if (incio == null){
      incio = fin = nuevo;
     }else{
         fin.sig = nuevo;
         nuevo.ant = fin;
         fin = nuevo ;
     }
     contador++; 
 }
 
}
