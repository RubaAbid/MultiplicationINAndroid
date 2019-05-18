package com.ruba.multiplicationinandroid;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et1 = findViewById(R.id.et1);
        final EditText et2 = findViewById(R.id.et2);
        Button btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.valueOf(et1.getText().toString().trim());//converting string to int
                int second = Integer.valueOf(et2.getText().toString().trim());
                int mul = first * second;

                Toast.makeText(MainActivity.this, String.valueOf(mul), Toast.LENGTH_LONG).show();

                et1.getText().clear();
                et2.getText().clear();
            }
        });
    }

}
