package com.example.user.signup_account;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText etName,etPass,etEmail;
    RadioButton rMale,rFemale;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.account);
        etEmail=(EditText)findViewById(R.id.txtemail);
        etPass=(EditText)findViewById(R.id.password);
        etName=(EditText)findViewById(R.id.tname);
        rg=(RadioGroup)findViewById(R.id.radiogroup);
        rFemale=(RadioButton)findViewById(R.id.female);
        rMale=(RadioButton)findViewById(R.id.male);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name=etName.getText().toString();
                final String email=etEmail.getText().toString();
                final String pass=etPass.getText().toString();
                 String gender="";

                if(rFemale.isChecked()){
                    gender="Mrs";
                }
                else {
                    gender="Mr";
                }
                //If i have a lot of button then need to find by this way
                int i=rg.getCheckedRadioButtonId();
                RadioButton rd=(RadioButton)findViewById(i);
                //---------------------------------------//

                Toast.makeText(MainActivity.this,"Name:"+ name+" \nemail: "+email+"\n password: "+pass+"\n Gender: "+rd.getText().toString(),Toast.LENGTH_LONG).show();


                Intent intent=new Intent(MainActivity.this,Show_info.class);
                //Always startActivity age value pass korte hobe

                //string ar vitore ja ase ta ak akta level
                //next activity ar getExtra function a aitai likhte hobe--- space thakle tai dite hobe
                intent.putExtra("name",name);
                intent.putExtra("email",email);
                intent.putExtra("password",pass);
                intent.putExtra("gender",gender);

                startActivity(intent);





            }
        });
    }
}
