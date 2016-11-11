package leoh4410.proyectomuni.utils;

/**
 * Created by USUARIO on 04/11/2016.
 */
public enum TipoReclamo {
    TRATAMIENTO_BASURA("Tratamiento de basura", 0),
    ROTURA_CALLE("Rotura de calle", 1),
    DAÑO_EDIFICIO("Daño en un edificio", 2),
    SEÑALIZACION_VIAL("Señalización vial", 3),
    ILUMINACIÓN("Iluminación", 4),
    INFRACCIÓN("Infracción", 5),
    OTROS("Otros reclamos", 6);

    private String stringValue;
    private int intValue;

    private TipoReclamo(String toString, int value) {
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
