package leoh4410.proyectomuni.activities.menu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import leoh4410.proyectomuni.R;
import leoh4410.proyectomuni.models.Reclamo;


/**
 * A simple {@link Fragment} subclass.
 */
public class LastFragment extends Fragment {

    RecyclerView recycler_View;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    //TODO
    int [] imagenId = {R.drawable.pic_basura, R.drawable.pic_escombros, R.drawable.pic_luminaria,R.drawable.pic_ramas, R.drawable.pic_semaforo};
    String [] categoria, subCategoria, usuario;
    ArrayList<Reclamo> listaReclamos = new ArrayList<Reclamo>();


    public LastFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //TODO
        categoria = getResources().getStringArray(R.array.Categoría);
        subCategoria = getResources().getStringArray(R.array.Sub_Categoría);
        usuario = getResources().getStringArray(R.array.Usuario);

        //TODO
        int count=0;
        for (String cat:categoria)
        {
            Reclamo reclamo = new Reclamo(imagenId[count],usuario[count],cat, subCategoria[count]);
            count++;
            listaReclamos.add(reclamo);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_last, container, false);
        recycler_View = (RecyclerView) view.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this.getActivity());
        recycler_View.setLayoutManager(layoutManager);
        recycler_View.setHasFixedSize(true);
        adapter= new ReclamoAdapter(listaReclamos);
        recycler_View.setAdapter(adapter);
        return view;
    }

}
