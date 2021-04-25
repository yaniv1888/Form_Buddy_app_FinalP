package com.example.testapp.customers;

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

public class CTaxActivity extends AppCompatActivity {
    Button submit,previous,uploadfilesTax;
    EditText NameEdit;
    EditText id;
    EditText mail;
    EditText phonenumber;


    TextView mText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax);
        submit = (Button)findViewById(R.id.Cpackbutton);
        previous = (Button)findViewById(R.id.previous_button);
        uploadfilesTax = (Button) findViewById(R.id.uploadfilestax);

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                NameEdit = (EditText)findViewById(R.id.editCnametext);
                id = (EditText)findViewById(R.id.editIDtext);
                phonenumber = (EditText)findViewById(R.id.editPhonetext);
                mail = (EditText)findViewById(R.id.editMailtext);
                mText = (TextView)findViewById(R.id.details_text);
                mText.setText("ברוך הבא" + "\n" +"השם:" + NameEdit.getText().toString() + "\n" + "ת.ז:" + id.getText().toString()
                        + "\n" + "אימייל" + mail.getText().toString() +"\n" + "מספר פלאפון:" + phonenumber.getText().toString());
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCustomerActivity();
            }
        });
        uploadfilesTax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUploadFiles();
            }
        });
    }
    public void openCustomerActivity(){
        Intent intent = new Intent(this,CustomersActivity.class);
        startActivity(intent);
    }
    public void openUploadFiles(){
        Intent intent = new Intent(this,AdvanceFileUpload.class);
        startActivity(intent);
    }
}