package com.example.app5;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtVehicle = findViewById(R.id.txtVehicle);
        TextView txtCar = findViewById(R.id.txtCar);
        TextView txtMotorcycle = findViewById(R.id.txtMotorcycle);
        final TextView txtResult = findViewById(R.id.txtResult);

        Button btnGo = findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult.setText("Button clicked");
            }
        });

        Vehicle myVehicle = new Vehicle(100, true, 4);
        myVehicle.ride();
        txtVehicle.setText(myVehicle.toString());

        Car myCar = new Car(200, true, 4);
        myCar.ride();
        txtCar.setText(myCar.toString());

        Motorcycle myMotorcycle = new Motorcycle(225, true, 2);
        myMotorcycle.ride();
        txtMotorcycle.setText(myMotorcycle.toString());




    }
}