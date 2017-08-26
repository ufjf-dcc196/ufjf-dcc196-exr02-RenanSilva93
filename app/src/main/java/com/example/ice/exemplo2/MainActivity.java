package com.example.ice.exemplo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numero1, numero2;
    private Button calcuar, calcularMenos, calcularMultiplicacao, calcularDivisao;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Encontre os componentes de entrada
        this.numero1 = (EditText) findViewById(R.id.numero1);
        this.numero2 = (EditText) findViewById(R.id.numero2);

        //Encontre os componentes de saida
        this.resultado = (TextView) findViewById(R.id.resultado);

        //Encontre os componentes de controle
        this.calcuar = (Button) findViewById(R.id.calcular);
        this.calcularMenos = (Button) findViewById(R.id.calcularMenos);
        this.calcularMultiplicacao = (Button) findViewById(R.id.calcularMultiplicacao);
        this.calcularDivisao = (Button) findViewById(R.id.calcularDivisao);

        //Configurar os ouvintes para eventos
        Ouvinte ouvinte = new Ouvinte();
        this.calcuar.setOnClickListener(ouvinte);
        this.calcularMenos.setOnClickListener(ouvinte);
        this.calcularMultiplicacao.setOnClickListener(ouvinte);
        this.calcularDivisao.setOnClickListener(ouvinte);
    }

    private class Ouvinte implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Integer n1 = Integer.parseInt(numero1.getText().toString());
            Integer n2 = Integer.parseInt(numero2.getText().toString());

            if(view == calcuar){
                resultado.setText("A soma é: "+(n1+n2));
            } else if(view == calcularMenos){
                resultado.setText("A soma é: "+(n1-n2));
            } else if(view == calcularMultiplicacao) {
                resultado.setText("A soma é: "+(n1*n2));
            } else if(view == calcularDivisao){
                if(n2 == 0){
                    resultado.setText("Invalido");
                } else {
                    resultado.setText("A soma é: "+(n1/n2));
                }
            }


        }
    }
}
