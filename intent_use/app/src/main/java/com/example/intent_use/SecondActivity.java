package com.example.intent_use;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    String name, address, designation, salary, mobile, mail;
    Button btnnext;
    TextView txtname, txtaddress, txtdesignation, txtsalary, txtmobile, txtmail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activitysecond);
        super.onCreate(savedInstanceState);
        final String name, address, designation, salary, mobile, mail;
        txtname = findViewById(R.id.textname);
        txtaddress = findViewById(R.id.textaddress);
        txtdesignation = findViewById(R.id.textdesignation);
        txtsalary = findViewById(R.id.textsalary);
        txtmobile = findViewById(R.id.textmobile);
        txtmail = findViewById(R.id.textmail);
        btnnext = findViewById(R.id.btn_next);

        Bundle bundle = getIntent().getExtras();
        name = bundle.getString("name_key");
        address = bundle.getString("address_key");
        designation = bundle.getString("designation_key");
        salary = bundle.getString("salary_key");
        mobile = bundle.getString("mobile_key");
        mail = bundle.getString("mail_key");

        txtname.setText(name);
        txtaddress.setText(address);
        txtdesignation.setText(designation);
        txtsalary.setText(salary);
        txtmobile.setText(mobile);
        txtmail.setText(mail);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("name_key2", name);
                intent.putExtra("designation_key2", designation);
                startActivity(intent);

            }
        });

    }
}
