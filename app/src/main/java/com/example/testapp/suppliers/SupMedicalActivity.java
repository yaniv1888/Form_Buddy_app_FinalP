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
import android.widget.ListView;
import android.widget.Toast;

import com.example.testapp.R;

public class SupMedicalActivity extends AppCompatActivity {

    ListView sup1;


    String[] strings = {"Yaniv" ,"David","Aviv","Matias","Lior","Nir","Lisa","Ron","Amit","Yoni","Yakir","Noa","Keren","Yair","Eli","Shay","Alon","Erez"};

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sup_medical);
        sup1 = (ListView)findViewById(R.id.SupMeducal_List_ViewUsers);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,strings);
        sup1.setAdapter(adapter);
        sup1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (strings[i] == "Yaniv" ) {

                    Intent intent = new Intent(SupMedicalActivity.this, UserSupActivity.class);
                    startActivity(intent);

                } else if(strings[i]=="David"){
                    Intent intent = new Intent(SupMedicalActivity.this,UserSup2Activity.class);
                    startActivity(intent);
                }
            }
        });

    }
}

