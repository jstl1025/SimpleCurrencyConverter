package com.prototype.simplecurrencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {
        EditText dollarEditText = findViewById(R.id.dollarEditText);
        String dollarString = dollarEditText.getText().toString();
        if (!dollarString.isEmpty()) {
            Double dollarValue = Double.parseDouble(dollarString);
            Double convertToNTD = dollarValue * 23.77;
            String amountInString = String.format("%.2f", convertToNTD);
            Toast.makeText(this, "CAD $" + dollarValue + " is NTD $" + amountInString, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
