package ec.edu.ounl.carrion.a.jose.unljosecarrionfichaapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;

public class Principal extends AppCompatActivity {

    TextView resultadoGrados, resultadoF;
    Button botonC, botonF;
    EditText Fahrenheit, Centigrados;

    @SuppressLint("LongLogTag")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //Como etiqueta (Tag) pon el nombre de la clase y como texto del mensaje tus nombre y apellidos.
        // Pega a continuación la línea de Log que has utilizado.
        String TAG = "José Alexis Carrión Ojeda";
        Log.e (TAG, "Error");

        resultadoGrados = (TextView) findViewById(R.id.lblConversionC);
        resultadoF = (TextView) findViewById(R.id.lblConversionF);
        Fahrenheit = (EditText) findViewById(R.id.txtFahrenheit);
        Centigrados = (EditText) findViewById(R.id.txtCentigrados);

        botonC = (Button) findViewById(R.id.btnConvertirC);
        botonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numF = Double.parseDouble(Fahrenheit.getText().toString());
                double result_C = (numF * 1.8000) + 32.00; //de F a C
                resultadoGrados.setText(" "+ result_C +" ºF");

            }
        });

        botonF = (Button) findViewById(R.id.btnConvertirF);
        botonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numC = Double.parseDouble(Centigrados.getText().toString());
                double result_F = (numC - 32) / 1.80000;
                resultadoF.setText("" + result_F + "ºC ");
            }
        });

    }
}
