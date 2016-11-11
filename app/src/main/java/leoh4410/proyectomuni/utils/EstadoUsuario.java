package leoh4410.proyectomuni.utils;

/**
 * Created by USUARIO on 04/11/2016.
 */
public enum EstadoUsuario {
    PENDIENTE("Usuario pendiente", 0),
    HABILITADO("Usuario habilitado", 1),
    DADO_BAJA("Usuario dado de baja", 2),
    BLOQUEADO("Usuario bloqueado", 3);

    private String stringValue;
    private int intValue;

    private EstadoUsuario(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    public String getDescripcion() { return stringValue; }
    public int getNumero() { return intValue; }

    @Override
    public String toString() {
        return stringValue;
    }
}
