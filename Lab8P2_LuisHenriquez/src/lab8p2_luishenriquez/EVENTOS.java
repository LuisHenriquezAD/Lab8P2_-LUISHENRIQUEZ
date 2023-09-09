package lab8p2_luishenriquez;

import java.io.Serializable;


public class EVENTOS implements Serializable {
   
private String estilo;

private int distancia;

private double record;

    public EVENTOS(String estilo, int distancia, double record) {
        this.estilo = estilo;
        this.distancia = distancia;
        this.record = record;
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

    @Override
    public String toString() {
        return "EVENTOS = " + "Estilo = " + estilo + ", Distancia = " + distancia + ", Record en segundos = " + record ;
    }

    
    
    
    
    
}
