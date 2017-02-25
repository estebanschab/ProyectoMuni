package leoh4410.proyectomuni.dto;

import java.util.List;

import leoh4410.proyectomuni.utils.EstadoReclamo;
import leoh4410.proyectomuni.utils.TipoReclamo;

/**
 * Created by USUARIO on 04/11/2016.
 */
public class ReclamoDTO {

    private int id_imagen;
    private String nombre, categoria, subCategoria;
    //Hasta acá atributos utilizados como prueba...

    private long numero;
    private int idUsuario;
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


}
