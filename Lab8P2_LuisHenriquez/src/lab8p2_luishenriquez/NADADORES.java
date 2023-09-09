/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_luishenriquez;

import java.io.Serializable;

/**
 *
 * @author LUIS HENRIQUEZ
 */
public class NADADORES implements Serializable {
    
  private String nombre;  
  
  private String nacionalidad;
  
  private int edad;
  
  private int estatura;
  
  private String estilo;
  
  private int distancia;
  
  private double record;
  
  private int medallas;

    public NADADORES(String nombre, String nacionalidad, int edad, int estatura, String estilo, int distancia, double record, int medallas) {
        
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.estatura = estatura;
        this.estilo = estilo;
        this.distancia = distancia;
        this.record = record;
        this.medallas = medallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getRecord() {
        return record;
    }

    public void setRecord(double record) {
        this.record = record;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    @Override
    public String toString() {
        return "NADADORES = " + " Nombre = " + nombre +", Nacionalidad = " + nacionalidad + ", Edad = " + edad + ", Estatura = " + estatura + ", Estilo de natacion = " + estilo + ", Distancia en la que competira = " + distancia + ", Tiempo mas rapido = " + record + ", Numero de Medallas = " + medallas ;
    }
  
  
  
  
  
  
}
