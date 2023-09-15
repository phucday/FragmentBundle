package com.example.fragmentbundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtmain;
    Button btnmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtmain = findViewById(R.id.txtmain);
        btnmain = findViewById(R.id.btnmain);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        btnmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new Fragment();
                fragmentTransaction.add(R.id.linearmain,fragment);
                fragmentTransaction.commit();

                Bundle bundle = new Bundle();
                bundle.putString("day la key","Truyen qua Bundle");
                fragment.setArguments(bundle);
            }
        });
    }
}