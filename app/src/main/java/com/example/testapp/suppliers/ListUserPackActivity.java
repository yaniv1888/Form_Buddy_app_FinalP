package com.example.testapp.suppliers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.testapp.R;

import java.lang.reflect.Array;

public class ListUserPackActivity extends AppCompatActivity {
    ListView v1;
    ArrayAdapter adapter;

    String[] strings = {"1","2","3","4","5","6","7","8"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supmailpack);

        v1 = (ListView)findViewById(R.id.List_ViewUsers);
        adapter = new ArrayAdapter(this, android.R.layout.activity_list_item);
        v1.setAdapter(adapter);
        v1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListUserPackActivity.this, ""  + strings[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}