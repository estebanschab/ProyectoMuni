package leoh4410.proyectomuni.models;

import com.orm.SugarRecord;

import org.w3c.dom.Text;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

import leoh4410.proyectomuni.dto.UsuarioDTO;
import leoh4410.proyectomuni.utils.EstadoReclamo;
import leoh4410.proyectomuni.utils.TipoReclamo;
import leoh4410.proyectomuni.utils.TipoUsuario;

public class Reclamo extends SugarRecord implements Serializable{

    //TODO
    private int id_imagen;
    private String nombre, categoria, subCategoria;
    //Hasta acá atributos utilizados como prueba...

    //ver como es el tema del campo id que autogenera SugarORM
    /**private long numero;
    private TipoReclamo tipoReclamo;
    private EstadoReclamo estadoReclamo;
    private String descripcion;
    private float latitud;
    private float longitud;
    private List<Imagen> imagenes;
    private List<Mensaje> mensajes;*/

    //TODO
    public Reclamo (int id_imagen, String nombre, String categoria, String subCategoria)
    {
        this.setId_imagen(id_imagen);
        this.setCategoria(categoria);
        this.setSubCategoria(subCategoria);
        this.setNombre(nombre);
    }

    /** public Reclamo (long numero, TipoReclamo tipoReclamo, EstadoReclamo estadoReclamo, String descripcion, float latitud, float longitud, List<Imagen> imagenes, List<Mensaje> mensajes) {
        this.numero = numero;
        this.tipoReclamo = tipoReclamo;
        this.estadoReclamo = estadoReclamo;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.imagenes = imagenes;
        this.mensajes = mensajes;
    }*/

    public int getId_imagen() {
        return id_imagen;
    }

    public void setId_imagen(int id_imagen) {
        this.id_imagen = id_imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }
}
