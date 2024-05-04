package es.albarregas.beans;

/**
 *
 * @author Jesús
 */
public class EdificioBean {
    
    private String[] tipoEdificio;
    private String[] numHabitaciones;
    private String[] fechaConstruccion;
    private int[] tipoConstruccion;
    private String[] valorMercado;
    
    

    public String[] getTipoEdificio() {
        return tipoEdificio;     
    }

    public String[] getNumHabitaciones() {
        return numHabitaciones;
    }

    public String[] getFechaConstruccion() {
        return fechaConstruccion;
    }

    public int[] getTipoConstruccion() {
        return tipoConstruccion;
    }

    public String[] getValorMercado() {
        return valorMercado;
    }

    public void setTipoEdificio(String[] tipoEdificio) {
        this.tipoEdificio = tipoEdificio;
    }

    public void setNumHabitaciones(String[] numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public void setFechaConstruccion(String[] fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public void setTipoConstruccion(int[] tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    public void setValorMercado(String[] valorMercado) {
        this.valorMercado = valorMercado;
    }
    
    
    
}
