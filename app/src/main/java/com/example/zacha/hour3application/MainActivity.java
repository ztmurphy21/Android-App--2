package com.example.zacha.hour3application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button to call Zach
        Button phoneNumber = (Button) findViewById(R.id.button1);
        phoneNumber.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View view){
               String phoneNumber ="7245167201";
               Intent intent = new Intent(Intent.ACTION_DIAL);
               intent.setData(Uri.parse("tel:" + phoneNumber));
               if(intent.resolveActivity(getPackageManager()) != null){
                   startActivity(intent);
               }
           }
        });

        //go to reddit
        Button webButton = (Button) findViewById(R.id.button2);
        webButton.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick (View view){
               String webURI = "http://www.reddit.com";
               Uri web = Uri.parse(webURI);
               Intent webIntent = new Intent(Intent.ACTION_VIEW, web);
               if(webIntent.resolveActivity(getPackageManager()) != null){
                   startActivity(webIntent);
               }
           }
        });

    }
}
