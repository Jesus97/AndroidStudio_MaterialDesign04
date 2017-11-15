package com.iesvirgendelcarmen.dam.materialdesign04;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(coordinaterLayout,"EJEMPLO DE SNACBAR",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

        btnInteractivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(coordinaterLayout,"EJEMPLO DE SNACBAR",Snackbar.LENGTH_LONG).setAction("UNDO",new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(coordinaterLayout,"MENSAJE RESTAURADO",Snackbar.LENGTH_SHORT);
                        snackbar1.show();
                    }
                });
                snackbar.show();
            }
        });

        btnPersonalizado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(coordinaterLayout,"NO ENCUENTRO LA RED",Snackbar.LENGTH_LONG).setAction("RETRY",new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(coordinaterLayout,"RED RESTAURADA",Snackbar.LENGTH_SHORT);
                        snackbar1.show();
                    }
                });
                snackbar.setActionTextColor(Color.CYAN);
                View sbView = snackbar.getView();
                TextView texto = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                texto.setTextColor(Color.YELLOW);
                snackbar.show();
            }
        });

    }
}
