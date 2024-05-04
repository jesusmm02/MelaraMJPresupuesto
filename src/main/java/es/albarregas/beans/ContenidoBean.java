package es.albarregas.beans;

/**
 *
 * @author Jesús
 */
public class ContenidoBean {
    
    private boolean cubrirDannos;
    private String[] cantidadASegurar;
    private int[] franquicia;

    public boolean isCubrirDannos() {
        return cubrirDannos;
    }

    public String[] getCantidadASegurar() {
        return cantidadASegurar;
    }

    public int[] getFranquicia() {
        return franquicia;
    }

    public void setCubrirDannos(boolean cubrirDannos) {
        this.cubrirDannos = cubrirDannos;
    }

    public void setCantidadASegurar(String[] cantidadASegurar) {
        this.cantidadASegurar = cantidadASegurar;
    }

    public void setFranquicia(int[] franquicia) {
        this.franquicia = franquicia;
    }
    
    
    
}
