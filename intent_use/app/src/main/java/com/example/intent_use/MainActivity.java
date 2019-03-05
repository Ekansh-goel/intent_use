package com.example.intent_use;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtname, edtaddress, edtdesignation, edtsalary, edtmobile, edtmail;
    private Button btn_next;

    private Button btn_show;
    String name, address, designation, salary, mobile, mail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtname = findViewById(R.id.edt_name);
        edtaddress = findViewById(R.id.edt_address);
        edtdesignation = findViewById(R.id.edt_designation);
        edtsalary = findViewById(R.id.edt_salary);
        edtmobile = findViewById(R.id.edt_mobile);
        edtmail = findViewById(R.id.edt_mail);

        btn_show = findViewById(R.id.btn_show);
        btn_next = findViewById(R.id.btn_next1);


        //function of show:
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = edtname.getText().toString().trim();
                address = edtaddress.getText().toString().trim();
                designation = edtdesignation.getText().toString().trim();
                salary = edtsalary.getText().toString().trim();
                mobile = edtmobile.getText().toString().trim();
                mail = edtmail.getText().toString().trim();
                Toast.makeText(MainActivity.this, "details:" + name + "\n" + address + "\n" + designation + "\n" + salary + "\n" + mobile + "\n" + mail, Toast.LENGTH_LONG).show();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name_key", name);
                intent.putExtra("address_key", address);
                intent.putExtra("designation_key", designation);
                intent.putExtra("salary_key", salary);
                intent.putExtra("mail_key", mail);
                intent.putExtra("mobile_key", mobile);
                startActivity(intent);
            }
        });

    }


}
