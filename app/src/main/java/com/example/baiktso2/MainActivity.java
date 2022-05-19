package com.example.baiktso2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonchuyendoi;
    EditText duonglich;
    TextView amlich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        duonglich=findViewById(R.id.duonglich);
        buttonchuyendoi=findViewById(R.id.buttonchuyendoi);
        amlich=findViewById(R.id.amlich);

        buttonchuyendoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String can[]={"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bỉnh","Đinh","Mậu","kỷ"};
                String chi[]={"Thân","Dậu","Tuất","Hợi","Tý","sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};
                String di = duonglich.getText().toString();
                int m = Integer.parseInt(di);
                String am= can[m%10] + " " +chi[m%10];
                amlich.setText(am);
            }
        });
    }
}