package com.example.testapp.suppliers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.testapp.R;
import com.example.testapp.customers.CustomersActivity;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    Button btnLogin,prev;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)findViewById(R.id.login_username1);
        password = (EditText)findViewById(R.id.login_password1);
        btnLogin = (Button)findViewById(R.id.btn_signin1);
        prev = (Button)findViewById(R.id.previous_button);
        DB = new DBHelper(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if(user.equals("")||pass.equals(""))
                    Toast.makeText(LoginActivity.this, "אנא מלא את כל השדות!", Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkuserpass = DB.checkusernamepassword(user,pass);
                    if(checkuserpass ==  true){
                        Toast.makeText(LoginActivity.this, "ההתחברות בוצעה בהצלחה!", Toast.LENGTH_SHORT).show();
                        Intent intent =  new Intent(getApplicationContext(),SuppliersActivity.class);
                        startActivity(intent);

                    }else{
                        Toast.makeText(LoginActivity.this, "התחברות נכשלה", Toast.LENGTH_SHORT).show();
                    }

                }


            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginandRegisterActivity();
            }
        });
    }
    public void openLoginandRegisterActivity(){
        Intent intent =  new Intent(this, LoginandRegisterActivity.class);
        startActivity(intent);
    }
}