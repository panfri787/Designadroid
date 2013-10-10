package com.federacion.designadroid;

import android.os.Bundle;
import android.app.Activity;
import android.os.StrictMode;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    public final static String EXTRA_DNI = "com.federacion.designadroid.DNI";

    public final static String EXTRA_LICENCIA = "com.federacion.designadroid.LICENCIA";

    private EditText textDni;

    private EditText textLicencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(android.os.Build.VERSION.SDK_INT > 9){
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        textDni = (EditText) findViewById(R.id.editTextDNI);
        textLicencia = (EditText) findViewById(R.id.editTextLicencia);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void buttonClick(View v){
        if (!textDni.getText().toString().isEmpty() && !textLicencia.getText().toString().isEmpty()){
            PeticionDesignacion peticion = new PeticionDesignacion(textDni.getText().toString(), textLicencia.getText().toString());
            peticion.enviarPeticion();
            Log.d("Debug botton:","Boton pulsado con cosas escritas.");
            //startActivity(peticion.enviarPeticion(this));
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(),"Rellena los campos", Toast.LENGTH_SHORT);
            toast.show();
            Log.d("Debug boton:","Boton pulsado sin cosas escritas ¿Toast visible?");
        }
    }
    
}
