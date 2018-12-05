package com.example.vsvll.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    CheckBox checkBox1, checkBox2, checkBox3;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(checkBox1.isChecked() == true && checkBox2.isChecked() == true && checkBox3.isChecked() == true)
                {
                    textView.setText("You like Apple, Grapes & Orange");
                }

                else if(checkBox1.isChecked() == true && checkBox2.isChecked() )
                {
                    textView.setText("You like Apple & Grapes");
                }

                else if(checkBox1.isChecked() == true  && checkBox3.isChecked() == true)
                {
                    textView.setText("You like Apple & Orange");
                }

                else if(checkBox2.isChecked() == true  && checkBox3.isChecked() == true)
                {
                    textView.setText("You like Grapes & Orange");
                }
                    else if(checkBox1.isChecked() == true){

                        textView.setText("You like Apple");
                    }
                    else if(checkBox2.isChecked() == true)
                    {
                        textView.setText("You like Grapes");
                    }

                    else if(checkBox3.isChecked() == true)
                    {
                        textView.setText("You like Orange");
                    }

            }

        });

    }

}
