package com.example.aplikasiinputteks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView inputTeks;
    EditText editTeks;
    Button simpanTeks, hapusTeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTeks = (TextView) findViewById(R.id.textView);
        editTeks = (EditText) findViewById(R.id.editText);
        simpanTeks = (Button) findViewById(R.id.btnSimpan);
        hapusTeks = (Button) findViewById(R.id.btnHapus);
        simpanTeks.setOnClickListener(this);
        hapusTeks.setOnClickListener(this);
    }
    public void onClick(View x){
        switch (x.getId()){
            case R.id.btnSimpan:
                inputTeks.setText(inputTeks.getText().toString());
                break;
            case R.id.btnHapus:
                inputTeks.setText("");
                editTeks.setText("");
                break;
        }
    }
}