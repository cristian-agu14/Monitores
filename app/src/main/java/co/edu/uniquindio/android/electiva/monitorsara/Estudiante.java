package co.edu.uniquindio.android.electiva.monitorsara;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Cristian on 26/10/2017.
 */

public class Estudiante implements Parcelable {

    /**
     * Atributo nombre que representa el nombre del estudiante que asiste a la cita
     */
    private String nombre;

    /**
     * Atributo semestre que representa el semestre en el que va el estudiante que asiste a la cita
     */
    private String semestre;


    public Estudiante(String nombre, String semestre) {
        this.nombre = nombre;
        this.semestre = semestre;
    }

    protected Estudiante(Parcel in) {
        nombre = in.readString();
        semestre = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(semestre);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Estudiante> CREATOR = new Creator<Estudiante>() {
        @Override
        public Estudiante createFromParcel(Parcel in) {
            return new Estudiante(in);
        }

        @Override
        public Estudiante[] newArray(int size) {
            return new Estudiante[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

}
