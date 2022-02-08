package com.juamber.androidavanzado.Ejercicio9_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import com.juamber.androidavanzado.R;

public class Ejercicio9_1_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.ejercicio9_1_fragment, container, false);
    }
}
