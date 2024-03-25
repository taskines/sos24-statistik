package fi.arcada.codechallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView outputText;
    EditText inputText;
    double[] values = {1.2, 2.3, 4.5, 6.7, 8.9, 12.9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = findViewById(R.id.textView);
        inputText = findViewById(R.id.editTextText);

        outputText.setText("Min App Funkar");
    }


    private double calcMean(double[] data) {
        double sum = 0;
        for (double value : data) {
            sum += value;
        }
        return sum / data.length;
    }


    public void buttonHandler(View view) {

        String userInput = inputText.getText().toString();


        outputText.setText(userInput);


    }
    public void buttonHandler2 (View view) {
        double average = calcMean(values);
        outputText.append("\nMedeltal: " + average);
    }
}