package com.example.intent_use;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView text_name,text_desti;
    Button btn_load;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitythird);
        Bundle bundle = getIntent().getExtras();
        final String name = bundle.getString("name_key2");
        final String destination = bundle.getString("designation_key2");
        text_name=findViewById(R.id.txt_name);
        text_desti=findViewById(R.id.txt_designation);
        btn_load=findViewById(R.id.btnload);
        btn_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_name.setVisibility(View.VISIBLE);
                text_desti.setVisibility(View.VISIBLE);
                text_name.setText(name);
                text_desti.setText(destination);
            }
        });
    }
}
