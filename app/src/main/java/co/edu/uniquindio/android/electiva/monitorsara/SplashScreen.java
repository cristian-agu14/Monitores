package co.edu.uniquindio.android.electiva.monitorsara;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreen.this, Login_activity.class);
                startActivity(intent);
                finish();

                //Para enviar cada letra al TextView
                //  setContentView(R.layout.activity_splash_screen);
                //  TextView texto= (TextView) findViewById(R.id.textView);
                //texto.setText("S");

            }
        }, 2000);//Aquí le decimos al la ejecucion que espere por 3 segundos (3000 ms)
    }

}
