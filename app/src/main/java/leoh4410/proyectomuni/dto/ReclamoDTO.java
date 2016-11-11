package leoh4410.proyectomuni.dto;

import java.util.List;

import leoh4410.proyectomuni.utils.EstadoReclamo;
import leoh4410.proyectomuni.utils.TipoReclamo;

/**
 * Created by USUARIO on 04/11/2016.
 */
public class ReclamoDTO {
    long numero;
    TipoReclamo tipoReclamo;
    EstadoReclamo estadoReclamo;
    String descripcion;
    float latitud;
    float longitud;
    List<ImagenDTO> imagenes;
    List<MensajeDTO> mensajes;

    public ReclamoDTO () {

    }

    public ReclamoDTO (long numero, TipoReclamo tipoReclamo, EstadoReclamo estadoReclamo, String descripcion, float latitud, float longitud, List<ImagenDTO> imagenes, List<MensajeDTO> mensajes) {
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

    public List<ImagenDTO> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<ImagenDTO> imagenes) {
        this.imagenes = imagenes;
    }

    public List<MensajeDTO> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<MensajeDTO> mensajes) {
        this.mensajes = mensajes;
    }
}
