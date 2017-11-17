package co.edu.uniquindio.android.electiva.monitorsara;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by Cristian on 22/10/2017.
 */

public class Monitor implements Parcelable{

    /**
     * Atributo @nombre que representa el nombre del monitor
     */
    private String nombre;

    /**
     * Atributo @user que representa el usuario del monitor
     */
    private String user;

    /**
     * Atributo @pass que representa el passwork del monitor
     */
    private String pass;

    /**
     * Atributo @pass que representa la cedula del monitor
     */
    private String cedula;

    /**
     * Atributo @pass que representa la foto del monitor
     */
    private String foto;

    /**
     * Atributo @pass que representa el numero de telefono del monitor
     */
    private String nomeroTelefono;

    /**
     * Atributo @pass que representa el semestre en el cual se encuentra el monitor
     */
    private String semestre;

    /**
     * Atributo @pass que representa la linea de monitoria del monitor
     * Ejemplo: Matematicas, Programacion, Dibujo,
     */
    private String lineaMonitoria;

    /**
     * Atributo @pass que representa el lugar en donde el monitor se encuentra en la asesoria
     */
    private String lugarAtencion;

    /**
     * Atributo @pass que representa los horarios de asesoria del monitor
     * //
     */
    private Date horariosAtención;


    public Monitor(String nombre, String user, String pass) {
        this.nombre = nombre;
        this.user = user;
        this.pass = pass;
    }

    protected Monitor(Parcel in) {
        nombre = in.readString();
        user = in.readString();
        pass = in.readString();
        cedula = in.readString();
        foto = in.readString();
        nomeroTelefono = in.readString();
        semestre = in.readString();
        lineaMonitoria = in.readString();
        lugarAtencion = in.readString();
    }

    public static final Creator<Monitor> CREATOR = new Creator<Monitor>() {
        @Override
        public Monitor createFromParcel(Parcel in) {
            return new Monitor(in);
        }

        @Override
        public Monitor[] newArray(int size) {
            return new Monitor[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNomeroTelefono() {
        return nomeroTelefono;
    }

    public void setNomeroTelefono(String nomeroTelefono) {
        this.nomeroTelefono = nomeroTelefono;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getLineaMonitoria() {
        return lineaMonitoria;
    }

    public void setLineaMonitoria(String lineaMonitoria) {
        this.lineaMonitoria = lineaMonitoria;
    }

    public String getLugarAtencion() {
        return lugarAtencion;
    }

    public void setLugarAtencion(String lugarAtencion) {
        this.lugarAtencion = lugarAtencion;
    }

    public Date getHorariosAtención() {
        return horariosAtención;
    }

    public void setHorariosAtención(Date horariosAtención) {
        this.horariosAtención = horariosAtención;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(nomeroTelefono);
        dest.writeString(cedula);
        dest.writeString(foto);
        dest.writeString(semestre);
        dest.writeString(user);
        dest.writeString(pass);

    }
}
