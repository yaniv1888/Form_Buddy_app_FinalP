package com.example.testapp.customers;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.testapp.R;

public class CMedicalActivity extends AppCompatActivity {
    Button submitmedical,previousM;
    EditText NameEdit;
    EditText id;
    EditText mail;
    EditText phonenumber;
    EditText hight;
    EditText weight;
    TextView mText;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_medical);
        submitmedical = (Button)findViewById(R.id.InputInfoCmedical);
        previousM = (Button)findViewById(R.id.previous_button);

        submitmedical.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongViewCast")
            public void onClick(View view) {
                NameEdit = (EditText)findViewById(R.id.editCnametext);
                id = (EditText)findViewById(R.id.editIDtext);
                phonenumber = (EditText)findViewById(R.id.editPhonetext);
                mail = (EditText)findViewById(R.id.editMailtext);
                hight = (EditText)findViewById(R.id.editHighttext);
                weight = (EditText) findViewById(R.id.editweighttext);
                mText = (TextView)findViewById(R.id.details_text);
                mText.setText("ברוך הבא" + "\n" +"השם:" + NameEdit.getText().toString() + "\n" + "ת.ז:" + id.getText().toString()
                        + "\n" + "אימייל:" + mail.getText().toString() +  "\n" + "גובה:" + hight.getText().toString()
                + "\n" + "משקל:" + weight.getText().toString()  + "\n" + "מספר פלאפון:" + phonenumber.getText().toString());
            }
        });
        previousM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCustActivity();
            }
        });
    }
    public void openCustActivity(){
        Intent intent = new Intent(this,CustomersActivity.class);
        startActivity(intent);
    }
}