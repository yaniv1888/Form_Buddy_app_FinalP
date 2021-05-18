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

import com.example.testapp.R;

public class SupCovActivity extends AppCompatActivity {


    ListView Cov1;


    String[] strings = {"Yaniv" ,"David","Aviv","Matias","Lior","Nir","Lisa","Ron","Amit","Yoni","Yakir","Noa","Keren","Yair","Eli","Shay","Alon","Erez"};

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sup_cov);
        Cov1 = (ListView)findViewById(R.id.SupMeducal_List_ViewUsers);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,strings);
        Cov1.setAdapter(adapter);
        Cov1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (strings[i] == "Ron" ) {

                    Intent intent = new Intent(SupCovActivity.this, UserSupCov2.class);
                    startActivity(intent);

                } else if(strings[i]=="Eli"){
                    Intent intent = new Intent(SupCovActivity.this,UserSupCov1.class);
                    startActivity(intent);
                }
            }
        });

    }
}