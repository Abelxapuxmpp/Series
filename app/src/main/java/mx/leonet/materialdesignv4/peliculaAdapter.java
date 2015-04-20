package mx.leonet.materialdesignv4;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by L3oNeT on 19/04/15.
 */
public class peliculaAdapter extends RecyclerView.Adapter<peliculaAdapter.peliculaViewHolder> {
    private List<peliculas> items;

    public static class peliculaViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public ImageView imagen;
        public TextView titulo;
        public TextView calificacion;

        public peliculaViewHolder(View v) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.imagen);
            titulo = (TextView) v.findViewById(R.id.titulo);
            calificacion = (TextView) v.findViewById(R.id.calificacion);
        }
    }

    public peliculaAdapter(List<peliculas> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public peliculaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.pelicula_card, viewGroup, false);
        return new peliculaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(peliculaViewHolder viewHolder, int i) {
        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        viewHolder.titulo.setText(items.get(i).getTitulo());
        viewHolder.calificacion.setText("Calificacion:"+String.valueOf(items.get(i).getCalificacion()));
    }
}
