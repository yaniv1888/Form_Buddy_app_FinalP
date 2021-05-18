package com.example.testapp.suppliers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.testapp.R;

public class UserSupCov1 extends AppCompatActivity {
    TextView UserInfoEli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sup_cov1);
        UserInfoEli = (TextView)findViewById(R.id.details_text);
        UserInfoEli.setText( "ברוך הבא:" + "\n" + "שם:Eli" + "\n" +  "מספר ת.ז:3078442164" + "\n" + "מייל:E@gmail.com" + "\n" + "מספר פלאפון:0546877216" + "\n" +"צורכי טיפול:קבלת בדיקת קורונה" );


    }
}