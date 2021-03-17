package com.example.lab_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView simpleImageView = (ImageView) findViewById(R.id.imageView);
        simpleImageView.setBackgroundColor(Color.BLACK);
        ImageButton imageButtonPhoto = (ImageButton) findViewById(R.id.imageButton);
        // perform click event on button's
        imageButtonPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView first = (TextView) findViewById(R.id.student_name);
                first.setText("Veniamin");
                Toast.makeText(getApplicationContext(), "My First Name", Toast.LENGTH_SHORT).show();
            }
        });

        TextView iuca = (TextView) findViewById(R.id.textView);
        iuca.setText("IUCA");
        iuca.setTextColor(Color.WHITE);
        iuca.setBackgroundColor(Color.BLUE);
        Toast toast = Toast.makeText(getApplicationContext(), "I changed my name", Toast.LENGTH_LONG);
        toast.show();

        Button student = MainActivity.this.findViewById(R.id.student_name);
        student.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View student) {
                TextView last = (TextView) findViewById(R.id.student_name);
                last.setText("Burnashev");

                TextView group = (TextView) findViewById(R.id.textView);
                group.setText("IT-118");

                Toast toast = Toast.makeText(getApplicationContext(), "My last name", Toast.LENGTH_LONG);
                toast.show();

            }
        });


    }
}
