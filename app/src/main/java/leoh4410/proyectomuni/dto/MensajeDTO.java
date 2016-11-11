package leoh4410.proyectomuni.dto;

import org.w3c.dom.Text;

import java.sql.Date;
import java.sql.Time;

import leoh4410.proyectomuni.utils.TipoUsuario;

/**
 * Created by USUARIO on 04/11/2016.
 */
public class MensajeDTO {
    long numero;
    Date fechaEnviado;
    Time horaEnviado;
    Date fechaRecibido;
    Time horaRecibido;
    TipoUsuario tipoUsuario;
    String nombreUsuario;
    Text mensaje;

    public MensajeDTO(){

    }

    public MensajeDTO(long numero, Date fechaEnviado, Time horaEnviado, Date fechaRecibido, Time horaRecibido, TipoUsuario tipoUsuario, String nombreUsuario, Text mensaje){
        this.numero = numero;
        this.fechaEnviado = fechaEnviado;
        this.horaEnviado = horaEnviado;
        this.fechaRecibido = fechaRecibido;
        this.horaRecibido = horaRecibido;
        this.tipoUsuario = tipoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.mensaje =	mensaje;

    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getFechaEnviado() {
        return fechaEnviado;
    }

    public void setFechaEnviado(Date fechaEnviado) {
        this.fechaEnviado = fechaEnviado;
    }

    public Time getHoraEnviado() {
        return horaEnviado;
    }

    public void setHoraEnviado(Time horaEnviado) {
        this.horaEnviado = horaEnviado;
    }

    public Date getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public Time getHoraRecibido() {
        return horaRecibido;
    }

    public void setHoraRecibido(Time horaRecibido) {
        this.horaRecibido = horaRecibido;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Text getMensaje() {
        return mensaje;
    }

    public void setMensaje(Text mensaje) {
        this.mensaje = mensaje;
    }

}
