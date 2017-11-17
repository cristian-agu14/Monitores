package co.edu.uniquindio.android.electiva.monitorsara;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorCabecera extends RecyclerView.Adapter<AdaptadorCabecera.ViewHolder> {

    private ArrayList<Cita> mDataset;


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        TextView textViewNombreCita;

        TextView textViewFechaCita;


        ViewHolder(View v) {
            super(v);

            textViewNombreCita = (TextView) v.findViewById(R.id.numerocita);
            textViewFechaCita = (TextView) v.findViewById(R.id.fechacita);
        }



        public void binCit(Cita cita) {
            textViewNombreCita.setText(cita.getNumeroCita());
            textViewFechaCita.setText(cita.getFecha().toString());
        }

    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public AdaptadorCabecera(ArrayList<Cita> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AdaptadorCabecera.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_adaptador_cabecera, parent, false);

        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        // holder.textViewNombreCita.setText(mDataset.get(position).getNumeroCita());
        // holder.textViewFechaCita.setText(mDataset.get(position).getFecha());//ojo Cambiar esta linea por un widget que pueda
        //contener un Date (esta en String)

        Cita cita= mDataset.get(position);
        holder.binCit(cita);


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
