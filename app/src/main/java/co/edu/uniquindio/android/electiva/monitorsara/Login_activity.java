package co.edu.uniquindio.android.electiva.monitorsara;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class Login_activity extends AppCompatActivity {



    private Monitor monitor;

    //private ArrayList<Monitor> listaMonitores= new ArrayList<>();
    private Map<String, Monitor> listaMonitores= new HashMap<String, Monitor>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
        final Button botonIngresarLogin= (Button) findViewById(R.id.buttonLogin);

        ingresar(monitor=new Monitor("Cristian","cristian","123"));
        ingresar( monitor=new Monitor("Angela","angela","1234"));
        ingresar(monitor=new Monitor("Rodrigo","rodrigo","12345"));

        botonIngresarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = ((EditText)findViewById(R.id.input_usser)).getText().toString();
                String pass = ((EditText)findViewById(R.id.input_password)).getText().toString();

               if( verificarLogin(usuario, pass)){
                       Intent intent= new Intent(Login_activity.this, PrincipalLayout.class);
                       startActivity(intent);
               }else{
                   Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_SHORT).show();
               }


            }
        });
    }

    /**
     * Metodo que permite validar el Login de un {@link Monitor}
     * @param user que representa el {@link String} del usuario del monitor
     * @param pass que representa el {@link String} de la clave del monitor
     * @return true si el user corresponde al passwork
     * @return false si el user no corresponde al passrk o si el usuario no existe
     */


    /**
     * Metodo que compara que los
     * @param user
     * @param pass
     * @return
     */
    private boolean compararCorrespondientes(String user, String pass){
        if(user.equals(pass)){
            return true;
        }else{
            return false;
        }
    }

    public void ingresar(Monitor monitor) {
        listaMonitores.put(monitor.getUser(), monitor);
    }

    public boolean verificarLogin(String user, String pass) {
        boolean bandera = false;
        bandera = listaMonitores.containsKey(user);
        String aux = "";
        Monitor auxMonitor=null;
        if (bandera == true) {
            auxMonitor = listaMonitores.get(user);
            aux= auxMonitor.getPass();
            return comparar(aux, pass);

        } else {
            return false;
        }
    }

    public boolean comparar(String user, String pass){
        if(user.equals(pass)){
            return true;
        }else{
            return false;
        }
    }

}
