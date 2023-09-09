package lab8p2_luishenriquez;

import java.io.Serializable;
import java.util.ArrayList;

public class PAISES implements Serializable {

    private String nombre;

    private ArrayList<Object> nadadores = new ArrayList();
    
    private int medallas;

    public PAISES(String nombre, int medallas) {
        this.nombre = nombre;
        this.medallas = medallas;
    }

    public ArrayList<Object> getNadadores() {
        return nadadores;
    }

    public void setNadadores(ArrayList<Object> nadadores) {
        this.nadadores = nadadores;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    @Override
    public String toString() {
        return "PAISES :" + "\n"
                + "Nombre = " + nombre + ", Medallas obtenidas = " + medallas ;
    }

}
