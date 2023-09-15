package com.example.fragmentbundle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Fragment extends androidx.fragment.app.Fragment {
    TextView txtfr;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment,container,false);

        txtfr = view.findViewById(R.id.txtfr);

        Bundle bundle = getArguments();
        if(bundle != null){
            txtfr.setText(bundle.getString("day la key"));
        }
        return view;
    }
}
