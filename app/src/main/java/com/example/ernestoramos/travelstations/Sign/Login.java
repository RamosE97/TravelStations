package com.example.ernestoramos.travelstations.Sign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ernestoramos.travelstations.R;

public class Login extends AppCompatActivity implements View.OnClickListener {


    Button btnIngresar;
    TextView lblRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }
        //Asignamos los controles
        btnIngresar=findViewById(R.id.btnIngresar);
        lblRegistro=findViewById(R.id.lblRegistro);
        //Listeners
        btnIngresar.setOnClickListener(this);
        lblRegistro.setOnClickListener(this);

    }
    private void AbrirActivityRegistrar(){
        Intent act = new Intent(this,SignUp.class);
        startActivity(act);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case  R.id.btnIngresar:
                Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.lblRegistro:
                AbrirActivityRegistrar();
                break;
        }
    }
}
