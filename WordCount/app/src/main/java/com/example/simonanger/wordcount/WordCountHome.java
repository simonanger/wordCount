package com.example.simonanger.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountHome extends AppCompatActivity {

    EditText inputEditText;
    TextView resultText;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count_home);

        inputEditText = (EditText) findViewById(R.id.count_text);
        resultText = (TextView) findViewById(R.id.result);
        submitButton = (Button) findViewById(R.id.button);

    }

    public void onButtonClicked(View button) {
        int numberOfWords = Counter.countWords(inputEditText.getText().toString());
        if(numberOfWords > 1){
        resultText.setText("There are " + String.valueOf(numberOfWords)
                + " words in that sentence.");}
        else {
            resultText.setText("There is " + String.valueOf(numberOfWords)
                    + " word in that sentence.");}
    }
}