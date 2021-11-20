package com.example.convertcurrency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView currency;


    public void convert(View view) {
        EditText input = findViewById(R.id.inputCount);
        String cantString = input.getText().toString();
        double cantInput = Double.parseDouble(cantString);

        double dlls = cantInput * 19.4;
        String dllsString = String.format("%.2f",dlls);
        currency = (TextView) findViewById(R.id.dllsField);
        currency.setText("Dollares: $" + dllsString);

        double yens = cantInput * 114;
        String yensString = String.format("%.2f",yens);
        currency = (TextView) findViewById(R.id.yensField);
        currency.setText("Yenes: ¥" + yensString);

        double pChilenos = cantInput * 0.025;
        String chilenString = String.format("%.2f",pChilenos);
        currency = (TextView) findViewById(R.id.chilenosField);
        currency.setText("Peso Chileno: $" + chilenString);

        double lEsterlinas = cantInput * 0.036;
        String esterlString = String.format("%.2f",lEsterlinas);
        currency = (TextView) findViewById(R.id.esterlField);
        currency.setText("Libra Esterlina: £" + esterlString);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}