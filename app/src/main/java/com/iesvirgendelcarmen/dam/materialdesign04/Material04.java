package com.iesvirgendelcarmen.dam.materialdesign04;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Material04 extends AppCompatActivity {

    View coordinaterLayout;
    FloatingActionButton fab;
    Button btnSimple;
    Button btnInteractivo;
    Button btnPersonalizado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material04);

        coordinaterLayout = (View) findViewById(R.id.coordinaterLayout);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        btnSimple = (Button) findViewById(R.id.btnSimple);
        btnInteractivo = (Button) findViewById(R.id.btnInteractivo);
        btnPersonalizado = (Button) findViewById(R.id.btnPersonalizado);

        

    }
}
