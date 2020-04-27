package com.example.daggerex12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car1;
    @Inject Car car2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent component = ((DaggerApp) getApplication())
                .getComponent()
                .getActivityComponentFactory().create(100,1400);

        component.inject(this);
        car1.drive();
        car2.drive();
    }
}
