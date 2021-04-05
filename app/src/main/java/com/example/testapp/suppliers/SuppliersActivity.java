package com.example.testapp.suppliers;

import android.content.Intent;
import android.os.Bundle;

import com.example.testapp.MainActivity;
import com.example.testapp.customers.CovActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

import com.example.testapp.R;
public class SuppliersActivity extends AppCompatActivity {
    Button Smailpackbutton;
    Button Staxbutton;
    Button Smedicalbutton;
    Button Scovbutton;
    Button Sprev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suppliers);
        Smailpackbutton = (Button) findViewById(R.id.Sup_package_button);
        Smedicalbutton = (Button) findViewById(R.id.Sup_DoctorOffice_button);
        Staxbutton = (Button) findViewById(R.id.Sup_taxsOfiice_button);
        Scovbutton = (Button) findViewById(R.id.Sup_Covid19_button);
        Sprev = (Button) findViewById(R.id.Supprevious_button);
        Smailpackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSupmailpackActivity();
            }
        });

        Smedicalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSupMedicalActivity();
            }
        });

        Staxbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSupTaxActivity();
            }
        });
        Scovbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCovActivity();
            }
        });

        Sprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
    }
    public void openSupmailpackActivity(){
        Intent intent = new Intent(this,SupmailpackActivity.class);
        startActivity(intent);
    }
    public void openSupMedicalActivity(){
        Intent intent = new Intent(this, SupMedicalActivity.class);
        startActivity(intent);

    }
    public void openSupTaxActivity(){
        Intent intent = new Intent(this, SupTaxActivity.class);
        startActivity(intent);

    }
    public void openCovActivity(){
        Intent intent = new Intent(this, SupCovActivity.class);
        startActivity(intent);

    }
    public void openMainActivity(){
        Intent intent = new Intent(this,  MainActivity.class);
        startActivity(intent);
    }


}