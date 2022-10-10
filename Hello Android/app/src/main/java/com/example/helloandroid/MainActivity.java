package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText eName = (EditText) findViewById(R.id.eName);
        Button bClick = (Button) findViewById(R.id.bClick);
        TextView tName = (TextView) findViewById(R.id.tName);

        bClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tName.setText("Hello, " + eName.getText());
                openDialog();
            }
        });
    }

    public void openDialog() {

    }

//    public void clicked (View view) {
//        switch (view.getId()){
//            case R.id.bClick:
//                TextView text = findViewById(R.id.tName);
//                EditText editText = findViewById(R.id.eName);
//                text.setText("Hello, " + editText.getText());
//                break;
//        }
//    }
}