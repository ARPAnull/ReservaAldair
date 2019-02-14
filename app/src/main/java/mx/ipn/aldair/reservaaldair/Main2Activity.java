package mx.ipn.aldair.reservaaldair;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity{

    String nombre = "", fecha = "", hora = "", direccion = "", telefono = "", correo = "";
    int personas = 0;
    TextView muestraDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        muestraDatos = (TextView) findViewById(R.id.muestraDatos);

        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        nombre = recibe.getString("nombre");
        personas = recibe.getInt("personas");
        fecha = recibe.getString("fecha");
        hora = recibe.getString("hora");
        direccion = recibe.getString("direccion");
        telefono = recibe.getString("numero");
        correo = recibe.getString("correo");

        muestraDatos.setText("Reservacion a nombre de:" +
                nombre + "\n" +
                personas + "\n " +
                fecha + "\n " +
                hora + "\n " +
                direccion + "\n " +
                telefono + "\n " +
                correo + "\n "
        );



    }

    public void rese(View v) {
        Intent envia = new Intent(this, MainActivity.class);
        finish();
        startActivity(envia);
    }



}
