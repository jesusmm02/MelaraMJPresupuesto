package es.albarregas.beans;

import java.io.Serializable;

/**
 *
 * @author Jesús
 */
public class EleccionBean implements Serializable{
    
    private int eleccion[];
    

    public int[] getEleccion() {
        return eleccion;
    }

    public void setEleccion(int[] eleccion) {
        this.eleccion = eleccion;
    }
    
}
