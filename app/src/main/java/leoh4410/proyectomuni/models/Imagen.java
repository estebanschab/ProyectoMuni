package leoh4410.proyectomuni.models;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by USUARIO on 04/11/2016.
 */
public class Imagen  extends SugarRecord implements Serializable {

    //ver como es el tema del campo id que autogenera SugarORM


    long numero;
    String descripcion;
    String ruta;

    public Imagen(){

    }

    public Imagen(long numero, String descripcion, String ruta){
        this.numero = numero;
        this.descripcion = descripcion;
        this.ruta = ruta;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}