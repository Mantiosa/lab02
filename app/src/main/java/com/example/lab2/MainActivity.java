package com.example.lab2;

import static utils.TextCounter.getCharsCount;
import static utils.TextCounter.getWordsCount;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Spinner spSelectionOptions;
    private EditText edPhrase;
    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edPhrase = findViewById(R.id.edPhrase);
        this.tvMain = findViewById(R.id.tvMain);

        this.spSelectionOptions = (Spinner) findViewById(R.id.spSelectionOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this. spSelectionOptions.setAdapter(adapter);
    }

    public void onBtnCountClick(View view) {
        String selectedOption = this.spSelectionOptions.getSelectedItem().toString();
        String defaultCharsSelectedOption = getResources().getString(R.string.chars_selection);
        String defaultWordsSelectedOption = getResources().getString(R.string.words_selection);

        if(selectedOption.equals(defaultCharsSelectedOption)){
            String userInputText = this.edPhrase.getText().toString();
            if(TextUtils.isEmpty(userInputText)){
                this.tvMain.setText("");
                Toast toast = Toast.makeText(getApplicationContext(), "It's empty!", 3);
                toast.show();
            }
            else {
                String charsCount = String.valueOf(getCharsCount(userInputText));;
                this.tvMain.setText(charsCount);
            }
        }
        if(selectedOption.equals(defaultWordsSelectedOption)){
            String userInputText = this.edPhrase.getText().toString();
            if(TextUtils.isEmpty(userInputText)){
                this.tvMain.setText("");
                Toast toast = Toast.makeText(getApplicationContext(), "It's empty!", 3);
                toast.show();
            }
            else {
                String wordsCount = String.valueOf(getWordsCount(userInputText));
                this.tvMain.setText(wordsCount);
            }
        }
    }


}