package com.example.testapp.customers;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import com.example.testapp.MainActivity;
import com.example.testapp.R;

public class CustomersActivity extends AppCompatActivity {
    Button cmailpackbutton;
    Button taxbutton;
    Button medicalbutton;
    Button covbutton;
    Button prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers);
        cmailpackbutton = (Button) findViewById(R.id.package_button);
        taxbutton = (Button) findViewById(R.id.taxsOfiice_button);
        medicalbutton = (Button) findViewById(R.id.DoctorOffice_button);
        covbutton = (Button) findViewById(R.id.Covid19_button);
        prev = (Button) findViewById(R.id.previous_button);
        cmailpackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCmailPackActivity();
            }
        });
        taxbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTaxActivity();
            }
        });
        medicalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCmedicalActivity();
            }
        });
        covbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCovidActivity();
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });


    }
    public void openMainActivity(){
        Intent intent =  new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openCmailPackActivity(){
        Intent intent = new Intent(this, CmailpackActivity.class);
        startActivity(intent);
    }

    public void openTaxActivity(){
        Intent intent = new Intent(this, CTaxActivity.class);
        startActivity(intent);
    }

    public void openCmedicalActivity(){
        Intent intent = new Intent(this, CMedicalActivity.class);
        startActivity(intent);
    }

    public void openCovidActivity(){
        Intent intent = new Intent(this,  CovActivity.class);
        startActivity(intent);
    }



}