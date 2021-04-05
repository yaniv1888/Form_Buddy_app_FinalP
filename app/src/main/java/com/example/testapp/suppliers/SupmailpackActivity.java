package com.example.testapp.suppliers;

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

public class SupmailpackActivity extends AppCompatActivity {

    ListView v1;


    String[] strings = {"Yaniv" ,"David","Aviv","Matias","Lior","Nir","Lisa","Ron","Amit","Yoni","Yakir","Noa","Keren","Yair","Eli","Shay","Alon","Erez"};

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supmailpack);

        v1 = (ListView)findViewById(R.id.List_ViewUsers);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,strings);
        v1.setAdapter(adapter);
        v1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SupmailpackActivity.this, " "  + "החבילות של " + strings[i] + " " + "מוכנים להעברה"  , Toast.LENGTH_SHORT).show();
            }
        });


    }

}