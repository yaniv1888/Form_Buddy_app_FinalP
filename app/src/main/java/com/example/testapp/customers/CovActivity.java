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

public class CovActivity extends AppCompatActivity {
    Button submitCov,previusCov;
    EditText NameEdit;
    EditText id;
    EditText mail;
    EditText phonenumber;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cov);

        submitCov = (Button)findViewById(R.id.Ccov_kbutton);
        previusCov = (Button) findViewById(R.id.previous_button);

        submitCov.setOnClickListener(new View.OnClickListener() {
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

        previusCov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCustomerActivity();
            }
        });
    }
    public void openCustomerActivity(){
        Intent intent =  new Intent(this, CustomersActivity.class);
        startActivity(intent);
    }
}
