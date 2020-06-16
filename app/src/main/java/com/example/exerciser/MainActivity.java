package com.example.exerciser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberPicker workout_number_picker_m = findViewById(R.id.workout_number_picker_min);
        workout_number_picker_m.setMinValue(0);
        workout_number_picker_m.setMaxValue(60);

        NumberPicker workout_number_picker_s = findViewById(R.id.workout_number_picker_sec);
        workout_number_picker_s.setMinValue(0);
        workout_number_picker_s.setMaxValue(60);

        NumberPicker break_number_picker_m = findViewById(R.id.break_number_picker_min);
        break_number_picker_m.setMinValue(0);
        break_number_picker_m.setMaxValue(60);

        NumberPicker break_number_picker_s = findViewById(R.id.break_number_picker_sec);
        break_number_picker_s.setMinValue(0);
        break_number_picker_s.setMaxValue(60);

        NumberPicker sets_number_picker = findViewById(R.id.sets_number_picker);
        sets_number_picker.setMinValue(0);
        sets_number_picker.setMaxValue(60);
    }
}
