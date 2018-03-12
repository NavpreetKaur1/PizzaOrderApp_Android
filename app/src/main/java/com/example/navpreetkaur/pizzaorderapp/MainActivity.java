package com.example.navpreetkaur.pizzaorderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     Pizza pizza;
     TextView total;
     double total_price;
     TextView delivery;
    EditText et;
    Switch svButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizza = new Pizza();
        total = findViewById(R.id.total);
        delivery = findViewById(R.id.dilveryNote);
        et = (EditText) findViewById(R.id.et);
        svButton = findViewById(R.id.switch1);

    }

    public void radioClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()){
        case R.id.rd1:
            if (checked)
                pizza.setPizza_size_prize(9);
            break;
            case R.id.rd2:
                if (checked)
                    pizza.setPizza_size_prize(10);
                break;
            case R.id.rd3:
                if (checked)
                    pizza.setPizza_size_prize(11);
                break;
        }
        total.setText("Total Prize : $" + String.format("%.2f",pizza.getPizza_size_prize()));
    }

    public void checkboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()){
            case R.id.ch1:
                if (checked)
                    pizza.setMeat_prize(2);
                else
                    pizza.setMeat_prize(0);
                break;
            case R.id.cb2:
                if (checked)
                    pizza.setCheese_prize(2);
                else
                    pizza.setCheese_prize(0);
                break;
            case R.id.cb3:
                if (checked)
                    pizza.setVeggie_prize(2);
                else
                    pizza.setVeggie_prize(0);
                break;
        }
        total.setText("Total Prize : $" + String.format("%.2f",calTotal()));
    }

    private double calTotal()
    {
        total_price = pizza.getPizza_size_prize() + pizza.getCheese_prize() + pizza.getMeat_prize()+ pizza.getVeggie_prize();

        return total_price;
    }

    public void onSwitchClicked(View view) {


        if(svButton.isChecked())
        {

            delivery.setText("Delivery Required");
            et.setEnabled(true);
            et.setFocusable(true);
            delivery.setText("");
            delivery.setText("Delivery Required at " + et.getText().toString());
            Log.d("User Address",et.getText().toString());
        }
        else if (! svButton.isChecked())
        {
            delivery.setText("Delivery Not required");
            et.setEnabled(false);
            et.setFocusable(false);

        }

    }
}
