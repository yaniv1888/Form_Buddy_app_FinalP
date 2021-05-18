package com.example.testapp.suppliers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.testapp.R;

public class UserSupCov2 extends AppCompatActivity {
    TextView UserInfoRon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sup_cov2);
        UserInfoRon = (TextView)findViewById(R.id.details_text);
        UserInfoRon.setText( "ברוך הבא:" + "\n" + "שם:Ron" + "\n" +  "מספר ת.ז:3087566421" + "\n" + "מייל:R@gmail.com" + "\n" + "גובה:189" + "\n" + "משקל:80" + "\n" + "מספר פלאפון:0546811452" + "\n" +"צורכי טיפול:תוצאה בדיקת קורונה" );

    }
}