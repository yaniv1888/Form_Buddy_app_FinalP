package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.example.testapp.customers.CustomersActivity;
import com.example.testapp.suppliers.LoginandRegisterActivity;
import com.example.testapp.suppliers.SuppliersActivity;

public class MainActivity extends AppCompatActivity {
    Button Customersbutton;
    Button Supplierbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Customersbutton = (Button) findViewById(R.id.button1);
        Customersbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
        Supplierbutton = (Button) findViewById(R.id.SuppButton);
        Supplierbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSupplierActivity();

            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this, CustomersActivity.class);
        startActivity(intent);
    }

    public void openSupplierActivity(){
        Intent intent = new Intent(this, LoginandRegisterActivity.class);
        startActivity(intent);
    }
}