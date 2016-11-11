package leoh4410.proyectomuni.dto;

/**
 * Created by USUARIO on 04/11/2016.
 */
public class ImagenDTO {

    long numero;
    String descripcion;
    String ruta;

    public ImagenDTO(){

    }

    public ImagenDTO(int numero, String descripcion, String ruta){
        this.numero = numero;
        this.descripcion = descripcion;
        this.ruta = ruta;
    }

    public long getNumero() {
        return this.numero;
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
