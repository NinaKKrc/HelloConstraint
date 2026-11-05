package com.example.helloconstraint;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int stevec = 0;
    TextView show_count;
    Button zero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        show_count = findViewById(R.id.textView);
        zero = findViewById(R.id.button2);

        zero.setBackgroundTintList(
                android.content.res.ColorStateList.valueOf(Color.GRAY));
    }
    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast!",
                Toast.LENGTH_SHORT).show();
    }
    public void countUp(View view) {
        stevec++;
        show_count.setText(String.valueOf(stevec));

        if (stevec % 2 == 0) {
            view.setBackgroundTintList(
                    android.content.res.ColorStateList.valueOf(Color.GREEN));
        } else {
            view.setBackgroundTintList(
                    android.content.res.ColorStateList.valueOf(Color.RED));
        }
        zero.setBackgroundTintList(
                android.content.res.ColorStateList.valueOf(Color.BLUE));
    }
    public void zeroCount(View view) {
        stevec = 0;
        show_count.setText("0");

        view.setBackgroundTintList(
                android.content.res.ColorStateList.valueOf(Color.GRAY));
    }
}