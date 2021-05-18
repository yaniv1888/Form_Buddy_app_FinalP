package com.example.testapp.suppliers;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.testapp.R;

public class SupTaxActivity extends AppCompatActivity {

    ListView Tax1;


    String[] strings = {"Yaniv" ,"David","Aviv","Matias","Lior","Nir","Lisa","Ron","Amit","Yoni","Yakir","Noa","Keren","Yair","Eli","Shay","Alon","Erez"};

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sup_tax);
        Tax1 = (ListView)findViewById(R.id.SupMeducal_List_ViewUsers);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,strings);
        Tax1.setAdapter(adapter);
        Tax1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (strings[i] == "Matias" ) {

                    Intent intent = new Intent(SupTaxActivity.this, SupUserTax1.class);
                    startActivity(intent);

                } else if(strings[i]=="Erez"){
                    Intent intent = new Intent(SupTaxActivity.this,SupUserTax2.class);
                    startActivity(intent);
                }
            }
        });

    }
}

