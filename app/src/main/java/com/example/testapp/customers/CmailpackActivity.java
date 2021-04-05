package com.example.testapp.customers;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.testapp.MainActivity;
import com.example.testapp.R;

public class CmailpackActivity extends AppCompatActivity {
    Button submit2,prev;
    EditText NameEdit;
    EditText id;
    EditText mail;
    EditText phonenumber;


    TextView mText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmailpack);
        submit2 = (Button)findViewById(R.id.Cpackbutton);
        prev = (Button) findViewById(R.id.previous_button);

        submit2.setOnClickListener(new View.OnClickListener() {
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

        prev.setOnClickListener(new View.OnClickListener() {
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