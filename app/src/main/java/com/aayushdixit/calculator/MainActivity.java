package com.aayushdixit.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button multiply;
    private Button divide;
    private Button add;
    private Button subtract;
    private Button clear;
    private TextView output;
    private EditText inputOne;
    private EditText inputTwo;
    private TextView prompt;
    private double x = 0;
    private double y = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        multiply = (Button) findViewById(R.id.button);
        divide = (Button) findViewById(R.id.button2);
        add = (Button) findViewById(R.id.button3);
        subtract = (Button) findViewById(R.id.button4);
        output = (TextView) findViewById(R.id.textView2);
        inputOne = (EditText) findViewById(R.id.editText);
        inputTwo = (EditText) findViewById(R.id.editText2);
        prompt = (TextView) findViewById(R.id.textView);
        clear = (Button) findViewById(R.id.button5);


        View.OnClickListener onClickListenerOne = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((inputOne.getText().toString().equals("") || inputTwo.getText().toString().equals("")) && (x == 0 || y == 0)) {
                    prompt.setText("Try again");
                } else {
                    x = Double.valueOf(inputOne.getText().toString());
                    y = Double.valueOf(inputTwo.getText().toString());
                    String c = String.valueOf(x * y);
                    output.setText(c);
                }

            }
        };

        View.OnClickListener onClickListenerTwo = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((inputOne.getText().toString().equals("") || inputTwo.getText().toString().equals("")) && (x == 0 || y == 0)) {
                    prompt.setText("Try again");
                } else {
                    x = Double.valueOf(inputOne.getText().toString());
                    y = Double.valueOf(inputTwo.getText().toString());
                    String c = String.valueOf(x / y);
                    if (x == 0 && y == 0) {
                        output.setText("undefined");
                    } else {
                        output.setText(c);
                    }
                }


            }
        };

        View.OnClickListener onClickListenerThree = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((inputOne.getText().toString().equals("") || inputTwo.getText().toString().equals("")) && (x == 0 || y == 0)) {
                    prompt.setText("Try again");
                } else {
                    x = Double.valueOf(inputOne.getText().toString());
                    y = Double.valueOf(inputTwo.getText().toString());
                    String c = String.valueOf(x + y);
                    output.setText(c);
                }

            }
        };

        View.OnClickListener onClickListenerFour = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((inputOne.getText().toString().equals("") || inputTwo.getText().toString().equals("")) && (x == 0 || y == 0)) {
                    prompt.setText("Try again");
                } else {
                    x = Double.valueOf(inputOne.getText().toString());
                    y = Double.valueOf(inputTwo.getText().toString());
                    String c = String.valueOf(x - y);
                    output.setText(c);
                }

            }
        };

        View.OnClickListener onClickListenerFive = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = 0;
                y = 0;
                inputOne.setText("");
                inputTwo.setText("");
                output.setText("Output");
                inputOne.requestFocus();
            }
        };
        multiply.setOnClickListener(onClickListenerOne);
        divide.setOnClickListener(onClickListenerTwo);
        add.setOnClickListener(onClickListenerThree);
        subtract.setOnClickListener(onClickListenerFour);
        clear.setOnClickListener(onClickListenerFive);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
