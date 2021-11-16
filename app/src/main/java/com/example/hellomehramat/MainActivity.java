package com.example.hellomehramat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    //private static final String EXTRA_MESSAGE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when
     *  the user taps the Send button */

    // Hello Mehramat

    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = (EditText) findViewById(R.id.EditText);
        String message = editText.getText().toString();

        TextView MyText = (TextView)  findViewById(R.id.Textfield1);
        MyText.setText(message);
        
        
        
        // intent.putExtra(EXTRA_MESSAGE, message);
        //   startActivity(intent);
    }
}



