package com.example.mycoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnIncrement, btnDecrement, btnOrder;
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIncrement = findViewById(R.id.btnIncrement);
        btnDecrement = findViewById(R.id.btnDecrement);
        btnOrder = findViewById(R.id.btnOrder);

        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Increment();
            }
        });

        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Decrement();
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SubmitOrder();
            }
        });
    }

    private void SubmitOrder() {
        int price = quantity*5;
        displayPrice(quantity);
    }

    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.textPrice);
//        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
        priceTextView.setText("KES " + number);
    }

    private void Decrement() {
        if (quantity>0){
            quantity= quantity-1;
            display(quantity);
        }

    }

    private void display(int number) {
        TextView quantityText = findViewById(R.id.textCups);
        quantityText.setText(number);
    }

    private void Increment() {
        quantity= quantity+1;
        display(quantity);

    }
}
