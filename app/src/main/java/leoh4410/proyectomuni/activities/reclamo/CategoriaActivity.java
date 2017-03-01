package leoh4410.proyectomuni.activities.reclamo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import leoh4410.proyectomuni.R;

public class CategoriaActivity extends AppCompatActivity {

    //TODO
    int[] imagenId = {R.drawable.ico_camion_basura, R.drawable.ico_luminaria, R.drawable.ico_semaforo, R.drawable.ico_limpieza, R.drawable.ico_bromatología};
    String[] categoria;
    ArrayList<Integer, String> listaReclamos = new ArrayList<Integer, String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);

        //TODO
        categoria = getResources().getStringArray(R.array.Categoría);
    }
}