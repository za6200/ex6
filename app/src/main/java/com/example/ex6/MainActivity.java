package com.example.ex6;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView,textView2,textView3,textView4,textView5,textView6;
    Button button,button2,button3,New;
    ImageView imageView2,imageView3,imageView4;
    EditText editText,editText2,editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        New = findViewById(R.id.New);

        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        editText = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);
        editText3 = findViewById(R.id.editTextNumber3);

        Random rnd = new Random();
        int rn1 = rnd.nextInt(89)+10;
        textView.setText(Integer.toString(rn1));
        int rn2 = rnd.nextInt(89)+10;
        textView2.setText(Integer.toString(rn2));
        int rn3 = rnd.nextInt(89)+10;
        textView3.setText(Integer.toString(rn3));
        int rn4 = rnd.nextInt(89)+10;
        textView4.setText(Integer.toString(rn4));
        int rn5 = rnd.nextInt(89)+10;
        textView5.setText(Integer.toString(rn5));
        int rn6 = rnd.nextInt(89)+10;
        textView6.setText(Integer.toString(rn6));




    }
}