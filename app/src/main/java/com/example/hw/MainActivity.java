package com.example.hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editName, editCode, editClass;
    private TextView textView, textView2, textView3, result1, result2;
    private Button btn;
    private RadioButton rbOne, rbTwo, rbThree, rbFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName  = (EditText) findViewById(R.id.editName);
        editCode = (EditText) findViewById(R.id.editCode);
        editClass = (EditText) findViewById(R.id.editClass);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        result1= (TextView) findViewById(R.id.result1);
        result2= (TextView) findViewById(R.id.result2);
        btn = (Button) findViewById(R.id.btn);
        rbOne = ( RadioButton) findViewById(R.id.rbOne);
        rbTwo = (RadioButton) findViewById(R.id.rbTwo);
        rbThree = (RadioButton) findViewById(R.id.rbThree);
        rbFour = (RadioButton) findViewById(R.id.rbFour);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String code = editCode.getText().toString();
                String class1 = editClass.getText().toString();

                if (rbOne.isChecked()){
                    result2.setText("Your grade is 1 Grade");
                } else if (rbTwo.isChecked()){
                    result2.setText("Your grade is 2 grade");
                } else if (rbThree.isChecked()){
                    result2.setText("Your grade is 3 Grade");
                } else if (rbFour.isChecked()){
                    result2.setText("Your grade is 4 Grade");
                }
                result1.setText("Ner:\t" + name + "\nAngi:\t" + class1 + "\nOyutnii code:\t" + code );

            }
        });
    }
}