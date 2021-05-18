package com.example.testapp.suppliers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.testapp.R;

public class SupUserTax2 extends AppCompatActivity {
    TextView UserInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sup_user_tax2);
        UserInfo = (TextView)findViewById(R.id.details_text);
        UserInfo.setText( "ברוך הבא:" + "\n" + "שם:Erez" + "\n" +  "מספר ת.ז:307123456" + "\n" + "מייל:E@gmail.com" + "\n" + "מספר פלאפון:054688221" + "\n" +"צורכי טיפול:קבלת תלושי שכר חודשיים" );

    }
}