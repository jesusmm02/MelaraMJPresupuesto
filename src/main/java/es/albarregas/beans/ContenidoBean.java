package es.albarregas.beans;

import java.io.Serializable;

/**
 *
 * @author Jesús
 */
public class ContenidoBean implements Serializable{
    
    private boolean cubrirDanos;
    private String[] cantidadASegurar;
    private int[] franquicia;

    public boolean isCubrirDanos() {
        return cubrirDanos;
    }

    public String[] getCantidadASegurar() {
        return cantidadASegurar;
    }

    public int[] getFranquicia() {
        return franquicia;
    }

    public void setCubrirDanos(boolean cubrirDanos) {
        this.cubrirDanos = cubrirDanos;
    }

    public void setCantidadASegurar(String[] cantidadASegurar) {
        this.cantidadASegurar = cantidadASegurar;
    }

    public void setFranquicia(int[] franquicia) {
        this.franquicia = franquicia;
    }
    
    
    
}
