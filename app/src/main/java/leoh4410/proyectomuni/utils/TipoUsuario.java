package leoh4410.proyectomuni.utils;

/**
 * Created by USUARIO on 04/11/2016.
 */
public enum  TipoUsuario {
    USUARIO("Usuario final", 0),
    ADMINISTRADOR("Administrador", 1);

    private String stringValue;
    private int intValue;

    private TipoUsuario(String toString, int value) {
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
