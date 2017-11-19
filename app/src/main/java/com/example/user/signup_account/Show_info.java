package com.example.user.signup_account;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Show_info extends AppCompatActivity {

    private   TextView name,email,pass,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);

        Intent intent = getIntent();

        String n=intent.getStringExtra("name");
        String e=intent.getStringExtra("email");
        String p=intent.getStringExtra("password");
        String g=intent.getStringExtra("gender");

        name=(TextView)findViewById(R.id.txtname);
        email=(TextView)findViewById(R.id.txtemail);
        pass=(TextView)findViewById(R.id.txtpass);
        gender=(TextView)findViewById(R.id.txtgender);

        name.setText(n);
        email.setText(e);
        pass.setText(p);
        gender.setText(g);

    }
}
