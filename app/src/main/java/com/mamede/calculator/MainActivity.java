package com.mamede.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button numeroZero, numeroUm, numeroDois, numeroTres, numeroQuatro, numeroCinco, numeroSeis,
    numeroSete, numeroOito, numeroNove, virgula, subtracao,soma, multiplicao, divisao, igual, limpar, backespace;

    private TextView txtExpressao, txtResultado, txtEspressao1,txtEspressao2, txtEspressao3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IniciarComponetes();
        getSupportActionBar().hide();

        numeroZero.setOnClickListener(this);//recupera o click do conteudo atual
        numeroUm.setOnClickListener(this);
        numeroDois.setOnClickListener(this);
        numeroTres.setOnClickListener(this);
        numeroQuatro.setOnClickListener(this);
        numeroCinco.setOnClickListener(this);
        numeroSeis.setOnClickListener(this);
        numeroSete.setOnClickListener(this);
        numeroOito.setOnClickListener(this);
        numeroNove.setOnClickListener(this);
        virgula.setOnClickListener(this);
        soma.setOnClickListener(this);
        subtracao.setOnClickListener(this);
        divisao.setOnClickListener(this);
        multiplicao.setOnClickListener(this);




    }

    private void IniciarComponetes(){
        numeroZero =findViewById(R.id.bt_zero);
        numeroUm= findViewById(R.id.bt_one);
        numeroDois = findViewById(R.id.bt_two);
        numeroTres = findViewById(R.id.bt_three);
        numeroQuatro = findViewById(R.id.bt_four);
        numeroCinco = findViewById(R.id.bt_five);
        numeroSeis = findViewById(R.id.bt_six);
        numeroSete= findViewById(R.id.bt_seven);
        numeroOito = findViewById(R.id.bt_eigth);
        numeroNove = findViewById(R.id.bt_nine);
        virgula = findViewById(R.id.bt_virgula);
        subtracao = findViewById(R.id.bt_subtracao);
        soma = findViewById(R.id.bt_soma);
        multiplicao = findViewById(R.id.bt_multiplicao);
        divisao = findViewById(R.id.bt_divisao);
        igual = findViewById(R.id.bt_equals);
        limpar = findViewById(R.id.bt_C);
        backespace = findViewById(R.id.bt_backespace);
        txtResultado = findViewById(R.id.txt_resultado);
        txtExpressao = findViewById(R.id.txt_calc);
        txtEspressao1 = findViewById(R.id.txt_expressao1);
        txtEspressao2 = findViewById(R.id.txt_expressao2);
        txtEspressao3 = findViewById(R.id.txt_expressao3);
    }

    public void AcrescentarUmaExpressao (String string,boolean limpar_dados){
        if (txtResultado.getText().equals("")){
            txtExpressao.setText("");
        }
        if (limpar_dados){
            txtResultado.setText("");
            txtExpressao.append(string);
        } else{
            txtExpressao.append(txtResultado.getText());
            txtExpressao.append(string);
            txtResultado.setText("");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_zero:
                AcrescentarUmaExpressao("0",true);
                break;

            case R.id.bt_one:
                AcrescentarUmaExpressao("1", true);
                break;

            case R.id.bt_two:
                AcrescentarUmaExpressao("2", true);
                break;

            case R.id.bt_three:
                AcrescentarUmaExpressao("3", true);
                break;

            case R.id.bt_four:
                AcrescentarUmaExpressao("4", true);
                break;

            case R.id.bt_five:
                AcrescentarUmaExpressao("5", true);
                break;

            case R.id.bt_six:
                AcrescentarUmaExpressao("6",true);
                break;

            case R.id.bt_seven:
                AcrescentarUmaExpressao("7",true);
                break;

            case R.id.bt_eigth:
                AcrescentarUmaExpressao("8",true);
                break;

            case R.id.bt_nine:
                AcrescentarUmaExpressao("9",true);
                break;

            case R.id.bt_virgula:
                AcrescentarUmaExpressao(",",true);
                break;

            case R.id.bt_soma:
                AcrescentarUmaExpressao("+",false);
                break;

            case R.id.bt_subtracao:
                AcrescentarUmaExpressao("-",false);
                break;

            case R.id.bt_multiplicao:
                AcrescentarUmaExpressao("*",false);
                break;

            case R.id.bt_divisao:
                AcrescentarUmaExpressao("/",false);
                break;

        }

    }
}