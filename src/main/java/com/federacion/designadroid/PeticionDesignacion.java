package com.federacion.designadroid;

import android.content.Intent;
import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import 	org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pablo on 6/08/13.
 */
public class PeticionDesignacion {

    private String dni;

    private String licencia;

    public PeticionDesignacion(String pdni, String plicencia){
        dni = pdni;
        licencia = plicencia;
    }

    public String getDni() {
        return dni;
    }

    public String getLicencia() {
        return licencia;
    }

    public void enviarPeticion() {
        try{
            HttpClient client = new DefaultHttpClient();
            HttpPost request = new HttpPost("https://intrafeb.feb.es/ConsultaDesignacion/Inicio.aspx");

            List<NameValuePair> parameters = new ArrayList<NameValuePair>();
            parameters.add(new BasicNameValuePair("__VIEWSTATE","dDwtMTAyNjg0NjQ2Nzt0PDtsPGk8MT47PjtsPHQ8O2w8aTwxPjs+O2w8dDw7bDxpPDE+Oz47bDx0PDtsPGk8MD47PjtsPHQ8O2w8aTwxMz47PjtsPHQ8cDxwPGw8VGV4dDs+O2w8XGU7Pj47Pjs7Pjs+Pjs+Pjs+Pjs+Pjs+Pjs+cdLwYQJNLMDHWmtEZNKUTjo+53g="));
            parameters.add(new BasicNameValuePair("txtNick", getLicencia()));
            parameters.add(new BasicNameValuePair("txtDni", getDni()));
            parameters.add(new BasicNameValuePair("cmbTipoConsulta","1"));
            parameters.add(new BasicNameValuePair("btnValidar", "Validar"));
            request.setEntity(new UrlEncodedFormEntity(parameters));

            HttpResponse response = client.execute(request);

            Log.d("Respuesta:", response.toString());
        }
        catch(UnsupportedEncodingException e){
            Log.d("Excepcion:",e.toString());
        }
        catch(ClientProtocolException e){
            Log.d("Excepcion:",e.toString());
        }
        catch(IOException e){
            Log.d("Excepcion:",e.toString());
        }
    }


    /*public Intent enviarPeticion(MainActivity activity){
        Intent intent = new Intent(activity, MostrarDesignacion.class);
        intent.putExtra(activity.EXTRA_DNI, getDni());
        intent.putExtra(activity.EXTRA_LICENCIA,getLicencia());

        return intent;
    }*/
}
