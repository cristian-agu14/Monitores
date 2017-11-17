package co.edu.uniquindio.android.electiva.monitorsara;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import co.edu.uniquindio.android.electiva.monitorsara.util.AdaptadorDeCita;

public class PrincipalLayout extends AppCompatActivity {

    private static final int DELAY = 500;

    private AdaptadorCabecera adaptadorCabecera;

    private Estudiante estudiante;

    private Cita cita;

    private RecyclerView listadoDeCitas;

    private ArrayList<Cita> misCitas = new ArrayList<>();

    private Button botonDeAdaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_layout);


        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(estudiante = new Estudiante("Manuela jimenez", "I"));
        listaEstudiantes.add(estudiante = new Estudiante("Jefferson Agudelo", "IV"));
        listaEstudiantes.add(estudiante = new Estudiante("Angelica Beltran", "VII"));
        listaEstudiantes.add(estudiante = new Estudiante("Manuel Cardona", "III"));
        listaEstudiantes.add(estudiante = new Estudiante("Camilo Sanchez", "X"));
        listaEstudiantes.add(estudiante = new Estudiante("Valentina Lopera", "II"));
        listaEstudiantes.add(estudiante = new Estudiante("Jhon Jairo Murillo", "III"));


        // ArrayList<Cita>


        misCitas.add(cita = new Cita("Paradigma Orientado a Objetos", "1-nov-2017", "1", listaEstudiantes.get(0)));
        misCitas.add(cita = new Cita("Fundamentos", "2-nov-2017", "2", listaEstudiantes.get(1)));
        misCitas.add(cita = new Cita("Paradigma Orientado a Objetos", "3-nov-2017", "3", listaEstudiantes.get(2)));
        misCitas.add(cita = new Cita("Lenguaje de Programacion", "1-nov-2017", "4", listaEstudiantes.get(3)));
        misCitas.add(cita = new Cita("Paradigma Orientado a Objetos", "1-nov-2017", "5", listaEstudiantes.get(4)));
        misCitas.add(cita = new Cita("Analisis de algoritmos I", "1-nov-2017", "6", listaEstudiantes.get(5)));
        misCitas.add(cita = new Cita("Paradigma Orientado a Objetos", "1-nov-2017", "7", listaEstudiantes.get(6)));

        Log.v("",""+misCitas.size());

        listadoDeCitas = (RecyclerView) findViewById(R.id.recyclerView);

        final AdaptadorDeCita adaptador = new AdaptadorDeCita(misCitas);
        listadoDeCitas.setAdapter(adaptador);

        listadoDeCitas.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                false));

        // RecyclerView recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        // recyclerView.setHasFixedSize(true);

        //LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        // LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getApplicationContext());
        //linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);

        //recyclerView.setLayoutManager(linearLayoutManager);

        // misCitas.add(ingresarCitas(listaEstudiantes));

        //adaptadorCabecera = new AdaptadorCabecera(misCitas);
        //recyclerView.setAdapter(adaptadorCabecera);
        //recyclerView.setLayoutManager(linearLayoutManager);

        //botonDeAdaptador = new Button(this);


    }


    public void pasarA() {
        Cita auxCita = null;

        View numero = findViewById(R.id.numerocita);
        String n = numero.toString();
        String auxiliar = "";
        for (int i = 0; i < misCitas.size(); i++) {
            auxCita = misCitas.get(i);
            auxiliar = auxCita.getNumeroCita();
            if (auxiliar.equals(numero)) {

            }
        }
    }

    /**
     * Metodo para navegar de una opcion de la lista a su informacion
     *
     * @param view
     */
    public void pasarAInformacionCita(View view) {
        Intent intent = new Intent(this, DescripcionCita.class);
        startActivity(intent);
    }

    public void quitarImagen() {
    // R.drawable.alerta = R.drawable.eliminar;
    // final ImageView alerta = v.findViewById().(R.drawable.alerta)

    }


    public ArrayList<Cita> getMisCitas() {
        return misCitas;
    }

    public void setMisCitas(ArrayList<Cita> misCitas) {
        this.misCitas = misCitas;
    }

    public void eliminarCitas() {

        //  if (misCitas.size() == 0) {
        //     Toast.makeText(PrincipalLayout.this, "Lista Vacia", Toast.LENGTH_SHORT).show();
        //  } else {
        misCitas.remove(0);
        adaptadorCabecera.notifyItemRemoved(0);
        // }

    }

}
