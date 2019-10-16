package com.example.mycoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    Button buttonIncrement, buttonDecrement, buttonOrder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonIncrement = findViewById(R.id.btnIncrement);
        buttonDecrement = findViewById(R.id.btnDecrement);
        buttonOrder = findViewById(R.id.btnOrder);

        buttonIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increment();
            }
        });

        buttonDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrement();
            }
        });

        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitOrder();
            }
        });

    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder() {
        int price = quantity*5;
        displayPrice(price);
    }

    public void increment() {
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement() {
        if (quantity>0){
            quantity = quantity - 1;
            display(quantity);
        }
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityText = findViewById(R.id.textCups);
        quantityText.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.textPrice);
//        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
        priceTextView.setText("KES " + number);
    }
}
