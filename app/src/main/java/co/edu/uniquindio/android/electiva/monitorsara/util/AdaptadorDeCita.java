package co.edu.uniquindio.android.electiva.monitorsara.util;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import co.edu.uniquindio.android.electiva.monitorsara.Cita;
import co.edu.uniquindio.android.electiva.monitorsara.R;

/**
 * Created by Cristian on 30/10/2017.
 *
 * @author Cristian Agudelo
 * @author Angela Londoño
 * @author Rodigo Ramires
 */

public class AdaptadorDeCita extends RecyclerView.Adapter<AdaptadorDeCita.CitaViewHolder> {

    private ArrayList<Cita> listaCitas;

    /**
     * MEtodo constructor de la clase {@link AdaptadorDeCita}
     *
     * @param listaCitas lista que contiene las citas
     */
    public AdaptadorDeCita(ArrayList<Cita> listaCitas) {
        this.listaCitas = listaCitas;
    }

    @Override
    public CitaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_adaptador_cabecera, parent, false);
        CitaViewHolder citaVH = new CitaViewHolder(itemView);
        return citaVH;
    }

    @Override
    public void onBindViewHolder(CitaViewHolder holder, int position) {
        Cita cita = listaCitas.get(position);
        holder.binPersonaje(cita);
    }

    @Override
    public int getItemCount() {
        return listaCitas.size();
    }

    public static class CitaViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
        private TextView txtNombreCita;
        private TextView txtFechaCita;

        public CitaViewHolder(View itemView) {
            super(itemView);
            txtNombreCita = (TextView)
                    itemView.findViewById(R.id.numerocita);
            txtFechaCita = (TextView)
                    itemView.findViewById(R.id.fechacita);
            itemView.setOnClickListener(this);

        }

        public void binPersonaje(Cita cita) {

            txtNombreCita.setText(cita.getNumeroCita());
            txtFechaCita.setText(cita.getFecha());

        }

        @Override
        public void onClick(View v) {
            //  listener.onClickPosition(getAdapterPosition());
            //Log.d("TAG", "Element " + getAdapterPosition() + " clicked. "+ txtNombrePresonaje.getText());
            Log.i("hola","hola");
        }
    }

}
