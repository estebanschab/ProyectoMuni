package leoh4410.proyectomuni.activities.menu;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import leoh4410.proyectomuni.R;
import leoh4410.proyectomuni.models.Reclamo;

/**
 * Created by Leo on 13/01/2017.
 */
public class ReclamoAdapter extends RecyclerView.Adapter <ReclamoAdapter.ReclamoViewHolder> {

    //TODO
    ArrayList<Reclamo> reclamos = new ArrayList<Reclamo>();

    //TODO
    public ReclamoAdapter (ArrayList<Reclamo> reclamos)
    {
        this.reclamos=reclamos;
    }

    @Override
    public ReclamoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        ReclamoViewHolder reclamoViewHolder = new ReclamoViewHolder(view);
        return reclamoViewHolder;
    }

    @Override
    public void onBindViewHolder(ReclamoViewHolder holder, int position)
    {
        Reclamo rec = reclamos.get(position);
        holder.imagen.setImageResource(rec.getId_imagen());
        holder.categoria.setText(rec.getCategoria());
        holder.subCategoria.setText(rec.getSubCategoria());
        holder.usuario.setText(rec.getNombre());
    }

    @Override
    public int getItemCount() {return reclamos.size();}

    public static class ReclamoViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imagen;
        TextView categoria, subCategoria, usuario;
        public ReclamoViewHolder (View view)
        {
            super (view);
            imagen = (ImageView) view.findViewById(R.id.imageViewCardView);
            categoria = (TextView) view.findViewById(R.id.textViewCategoríaCardView);
            subCategoria = (TextView) view.findViewById(R.id.textViewSubCategoríaCardView);
            usuario = (TextView) view.findViewById(R.id.textViewUsuarioCardView);
        }
    }
}
