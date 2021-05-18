package com.example.testapp.suppliers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.testapp.R;

public class UserSupActivity extends AppCompatActivity {
    TextView UserIfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sup);
        UserIfo = (TextView)findViewById(R.id.details_text);
        UserIfo.setText( "ברוך הבא: " + "\n" + "שם:Yaniv" + "\n" +  "מספר ת.ז:307888221" + "\n" + "מייל:Y@gmail.com" + "\n" + "גובה:182" + "\n" + "משקל:75" + "\n" + "מספר פלאפון:054682997" + "\n" +"צורכי טיפול:לתת מרשם לתרופות" );
    }
}