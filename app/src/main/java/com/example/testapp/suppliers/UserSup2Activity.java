package com.example.testapp.suppliers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.testapp.R;

public class UserSup2Activity extends AppCompatActivity {
    TextView UserIfo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sup2);
        UserIfo2 = (TextView)findViewById(R.id.details_text);
        UserIfo2.setText( "ברוך הבא:" + "\n" + "שם:David" + "\n" +  "מספר ת.ז:307888222" + "\n" + "מייל:D@gmail.com" + "\n" + "גובה:185" + "\n" + "משקל:75" + "\n" + "מספר פלאפון:054682998" + "\n" +"צורכי טיפול:הפנייה לבדיקת דם" );
    }
}