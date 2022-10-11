package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText eName;
    private TextView tName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = findViewById(R.id.eName);
        tName = findViewById(R.id.tName);
    }

//    Pentru schimbarea textului
//    public void clicked(View view) {
//        if(eName.getText().equals(null)) {
//            tName.setText("Hello");
//        } else {
//            tName.setText("Hello, " + eName.getText());
//        }
//    }
//  Show me your apples

    public void clicked(View view) {
            showDialog();
    }

    public void showDialog() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setMessage("Hello, " + eName.getText())
                    .setPositiveButton("Positive", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(MainActivity.this, "You pressed positive button", Toast.LENGTH_LONG).show();
                        }
                    })
                    .setNegativeButton("Negative", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(MainActivity.this, "You pressed negative button", Toast.LENGTH_LONG).show();
                        }
                    });
        dialog.show();
    }

    public void addSome() {

    }
}