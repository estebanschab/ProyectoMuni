package leoh4410.proyectomuni.models;

import com.orm.SugarRecord;

import org.w3c.dom.Text;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

import leoh4410.proyectomuni.utils.EstadoReclamo;
import leoh4410.proyectomuni.utils.TipoReclamo;
import leoh4410.proyectomuni.utils.TipoUsuario;

/**
 * Created by USUARIO on 04/11/2016.
 */
public class Reclamo extends SugarRecord implements Serializable{

    //ver como es el tema del campo id que autogenera SugarORM

    long numero;
    TipoReclamo tipoReclamo;
    EstadoReclamo estadoReclamo;
    String descripcion;
    float latitud;
    float longitud;
    List<Imagen> imagenes;
    List<Mensaje> mensajes;

    public Reclamo () {

    }

    public Reclamo (long numero, TipoReclamo tipoReclamo, EstadoReclamo estadoReclamo, String descripcion, float latitud, float longitud, List<Imagen> imagenes, List<Mensaje> mensajes) {
        this.numero = numero;
        this.tipoReclamo = tipoReclamo;
        this.estadoReclamo = estadoReclamo;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.imagenes = imagenes;
        this.mensajes = mensajes;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public TipoReclamo getTipoReclamo() {
        return tipoReclamo;
    }

    public void setTipoReclamo(TipoReclamo tipoReclamo) {
        this.tipoReclamo = tipoReclamo;
    }

    public EstadoReclamo getEstadoReclamo() {
        return estadoReclamo;
    }

    public void setEstadoReclamo(EstadoReclamo estadoReclamo) {
        this.estadoReclamo = estadoReclamo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

}
