package com.example.testapp.suppliers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.testapp.MainActivity;
import com.example.testapp.R;

public class LoginandRegisterActivity extends AppCompatActivity {
    EditText username, password, repPassword;
    Button signup,signin,prev;
    DBHelper DB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginand_register);
        username = (EditText)findViewById(R.id.login_username);
        password = (EditText)findViewById(R.id.login_password);
        repPassword = (EditText)findViewById(R.id.repeat_password);
        signup = (Button)findViewById(R.id.btn_signup);
        signin = (Button)findViewById(R.id.btn_signin);
        prev = (Button)findViewById(R.id.previous_button);
        DB = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repPassword.getText().toString();

                if(user.equals("")||pass.equals("")||repass.equals(""))
                    Toast.makeText(LoginandRegisterActivity.this, "אנא מלא את כל השדות!", Toast.LENGTH_SHORT).show();
                else{
                    if(pass.equals(repass)){

                        Boolean checkuser = DB.checkusername(user);
                        if(checkuser == false){
                            Boolean insert = DB.insertData(user,pass);
                            if(insert == true){
                                Toast.makeText(LoginandRegisterActivity.this, "ההרשמה התבצעה בהצלחה!", Toast.LENGTH_SHORT).show();
                                Intent intent =  new Intent(getApplicationContext(),SuppliersActivity.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(LoginandRegisterActivity.this, "ההרשמה נכשלה!", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(LoginandRegisterActivity.this, "המשתמש כבר קיים! אנא התחבר בדף ההתחברות", Toast.LENGTH_SHORT).show();
                        }

                    }else{
                        Toast.makeText(LoginandRegisterActivity.this, "הסיסמא אינה תואמת!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);

            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
    }
    public void openMainActivity(){
        Intent intent =  new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}