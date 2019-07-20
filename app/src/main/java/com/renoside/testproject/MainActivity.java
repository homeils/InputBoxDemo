package com.renoside.testproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.renoside.inputbox.InputBox;

public class MainActivity extends AppCompatActivity {

    private InputBox username;
    private InputBox password;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, username.getText()+" + "+password.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
