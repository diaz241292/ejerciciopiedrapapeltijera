package com.uso.piedrapapel_otijera;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class NuevoJugador extends AppCompatActivity implements View.OnClickListener  {

    EditText NombreJugador;
    private Button btnRegistrar;
    public static String nomJugador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_jugador);
        this.btnRegistrar = (Button) findViewById(R.id.btnRegistrar);
        this.NombreJugador= (EditText) findViewById(R.id.edtNombreJugador);
        this.btnRegistrar.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nuevo_jugador, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        String NombreJugador;
        String nuevo = "nuevo";

        Intent data = new Intent();
        EditText miEditText = (EditText) findViewById(R.id.edtNombreJugador);
        this.nomJugador = miEditText.getText().toString();

        setResult(RESULT_OK, data);
        this.finish();

    }
}
