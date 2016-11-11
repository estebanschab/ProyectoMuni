package leoh4410.proyectomuni.utils;

/**
 * Created by USUARIO on 04/11/2016.
 */
public enum EstadoReclamo {
    PENDIENTE("Reclamo pendiente", 0),
    PROCESADO("Reclamo procesado", 1),
    REPARADO("Reclamo reparado", 2),
    NUEVO("Nuevo reclamo", 3);

    private String stringValue;
    private int intValue;

    private EstadoReclamo(String toString, int value) {
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
