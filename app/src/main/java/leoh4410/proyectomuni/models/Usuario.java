package leoh4410.proyectomuni.models;

import com.orm.SugarRecord;

import java.io.Serializable;
import java.util.ArrayList;

import leoh4410.proyectomuni.utils.EstadoUsuario;

/**
 * Created by USUARIO on 04/11/2016.
 */
public class Usuario extends SugarRecord implements Serializable {

    //ver como es el tema del campo id que autogenera SugarORM

    int dni;
    String nombre;
    String apellido;
    String mail;
    String password;
    int telefono;
    EstadoUsuario estadoUsuario;
    ArrayList<Reclamo> reclamos;

    public Usuario(){

    }

    public Usuario(int dni, String nombre, String apellido, String mail, String password, int telefono, EstadoUsuario estadoUsuario, ArrayList<Reclamo> reclamos){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.password = password;
        this.telefono = telefono;
        this.estadoUsuario = estadoUsuario;
        this.reclamos = reclamos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public EstadoUsuario getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(EstadoUsuario estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public ArrayList<Reclamo> getReclamos() {
        return reclamos;
    }

    public void setReclamos(ArrayList<Reclamo> reclamos) {
        this.reclamos = reclamos;
    }



}
