package com.example.thegreetingsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText input;
    TextView title;


    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        input = findViewById(R.id.editTextText);
        title = findViewById(R.id.mainTitle);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = input.getText().toString();
                Toast.makeText(
                        MainActivity.this,
                        "Hello " + userName + ", welcome to our application!",
                        Toast.LENGTH_SHORT).show();


            }
        });

    }


}