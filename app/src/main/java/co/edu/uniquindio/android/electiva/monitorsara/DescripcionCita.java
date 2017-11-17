package co.edu.uniquindio.android.electiva.monitorsara;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class DescripcionCita extends AppCompatActivity {


    private ImageButton botonCancelar;

    private ImageButton botonConfirmar;

    private PrincipalLayout principalLayout= new PrincipalLayout();




   // public DescripcionCita(DescripcionCita descripcionCita){
   //     this.descripcionCita = descripcionCita;
   // }

    //  public DescripcionCita(Button botonCancelar, Button confirmar) {
    //     this.botonCancelar = botonCancelar;
    //    this.confirmar = confirmar;
    // }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_cita);

        botonCancelar = (ImageButton) findViewById(R.id.imageButtonCancelar);

        botonConfirmar = (ImageButton) findViewById(R.id.imageButtonAceptar);

        botonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DescripcionCita.this);
                builder.setIcon(R.drawable.alerta);
                builder.setTitle("Atención! ¿Esta seguro que quiere CANCELAR la cita? si la cancela NO podrá agregarla de nuevo");
                builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DescripcionCita.this, "Cita Eliminada", Toast.LENGTH_SHORT).show();

                        eliminarCitas();
                       // isDestroyed();
                    }
                });

                builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DescripcionCita.this, "Cita Eliminada", Toast.LENGTH_SHORT).show();
                    }
                });


                AlertDialog alertDialog= builder.create();
                alertDialog.show();

            }
        });

        botonConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DescripcionCita.this);
                builder.setIcon(R.drawable.alerta);
                builder.setTitle("Atención! ¿El estudiante asistio a la asesoria?");

                builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(DescripcionCita.this, "Cita Confirmada", Toast.LENGTH_SHORT).show();

                        eliminarCitas();
                        // isDestroyed();
                    }
                });

                builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });



                AlertDialog alertDialog= builder.create();
                alertDialog.show();

            }
        });


    }

    public void eliminarCitas(){
        principalLayout.eliminarCitas();

    }

}
