package co.edu.uniquindio.android.electiva.monitorsara;

/**
 * Created by Cristian on 26/10/2017.
 */

public class Cita {

    /***
     * Numero de la cita
     */
    private String numeroCita;
    /**
     * Atributo lineaAsesoria que representa la linea de la asesoria de la cita
     */
    private String lineaAsesoria;

    /**
     * Atributo fecha que representa la fecha de la asesoria de la cita
     */
    private String fecha;

    /**
     * Atributo estudiante del objeto {@link Estudiante}
     */
    private Estudiante estudiante;


    public Cita(String lineaAsesoria, String fecha,String numeroCita, Estudiante estudiante) {
        this.lineaAsesoria = lineaAsesoria;
        this.fecha = fecha;
        this.numeroCita=numeroCita;
        this.estudiante = estudiante;
    }

    public String getLineaAsesoria() {
        return lineaAsesoria;
    }

    public void setLineaAsesoria(String lineaAsesoria) {
        this.lineaAsesoria = lineaAsesoria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String  getNumeroCita() {
        return numeroCita;
    }

    public void setNumeroCita(String numeroCita) {
        this.numeroCita = numeroCita;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
