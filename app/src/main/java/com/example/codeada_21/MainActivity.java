package com.example.codeada_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    TextWatcher tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et = (EditText) findViewById(R.id.input_age);
        final TextView tv = (TextView) findViewById(R.id.age);


        tt = new TextWatcher() {
            public void afterTextChanged(Editable s) {

                et.setSelection(s.length());
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                et.removeTextChangedListener(tt);
                et.setText(et.getText().toString().replace("A", "C"));
                et.addTextChangedListener(tt);

            }
        };
    }
}

//            Button mButton = (Button) findViewById(R.id.search);
//        mButton.setOnClickListener(new View.OnClickListener()
//
//            {
//                public void onClick (View view){
//                EditText mEdit = (EditText) findViewById(R.id.input_age);
//                TextView mText = (TextView) findViewById(R.id.age);
//                //mText.getText().clear();
//                mText.setText("Age inputted: " + mEdit.getText().toString() + "!");
//
//            }
//            }
//            );
