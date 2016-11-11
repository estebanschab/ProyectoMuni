package leoh4410.proyectomuni.dto;

import java.util.ArrayList;

import leoh4410.proyectomuni.utils.EstadoUsuario;

/**
 * Created by USUARIO on 04/11/2016.
 */
public class UsuarioDTO {
    int dni;
    String nombre;
    String apellido;
    String mail;
    String password;
    int telefono;
    EstadoUsuario estadoUsuario;
    ArrayList<ReclamoDTO> reclamos;

    public UsuarioDTO(){

    }

    public UsuarioDTO(int dni, String nombre, String apellido, String mail, String password, int telefono, EstadoUsuario estadoUsuario, ArrayList<ReclamoDTO> reclamos){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.password = password;
        this.telefono = telefono;
        this.estadoUsuario = estadoUsuario;
        this.reclamos = reclamos;
    }

}
