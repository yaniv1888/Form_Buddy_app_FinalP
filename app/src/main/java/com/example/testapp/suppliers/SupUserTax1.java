package com.example.testapp.suppliers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.testapp.R;

public class SupUserTax1 extends AppCompatActivity {
    TextView UserInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sup_user_tax1);
        UserInfo = (TextView)findViewById(R.id.details_text);
        UserInfo.setText( "ברוך הבא:" + "\n" + "שם:Matias" + "\n" +  "מספר ת.ז:307848552" + "\n" + "מייל:M@gmail.com" +"\n" + "מספר פלאפון:054699821" + "\n" +"צורכי טיפול:בדיקת מסמכים אישיים" );

    }
}