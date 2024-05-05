package es.albarregas.models;

/**
 *
 * @author Jesús
 */
public class CalcularCuota {
    
    // Método para calcular la cuota del seguro de continente
    public static double calcularCuotaContinente(String tipoEdificio, int numHabitaciones, int fechaConstruccion, String tipoConstruccion, double valorMercado) {
        double cuotaBasica = valorMercado * 0.005;
        double prima = cuotaBasica;

        switch (tipoEdificio) {
            case "piso":
                prima *= 0.95;
                break;
            case "casa":
                prima *= 1.00;
                break;
            case "adosado":
                prima *= 1.05;
                break;
            case "duplex":
                prima *= 1.10;
                break;
            case "chalet":
                prima *= 1.20;
                break;
            default:
                break;
        }

        prima += (numHabitaciones * (prima / 100));

        switch (fechaConstruccion) {
            case 1949:
                prima *= 0.09;
                break;
            case 1950:
            case 1990:
                prima *= 0.06;
                break;
            case 1991:
            case 2005:
                prima *= 0.04;
                break;
            case 2006:
            case 2015:
                prima *= 0.02;
                break;
            case 2016:
                prima *= 0.01;
                break;
            default:
                break;
        }

        if (tipoConstruccion.equals("madera")) {
            prima *= 0.1;
        }

        return prima;
    }

    // Método para calcular la cuota del seguro de contenido
    public static double calcularCuotaContenido(boolean daniosAccidentales, double cantidadAsegurada, int franquicia) {
        double prima = cantidadAsegurada * 0.008;

        if (daniosAccidentales) {
            prima *= 1.25;
        }

        if (franquicia == 500) {
            prima -= prima * 0.1;
        } else if (franquicia == 1000) {
            prima -= prima * 0.2;
        }

        return prima;
    }
    
}
