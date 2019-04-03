package com.diabin.fectec.example;

import android.os.Bundle;
import android.view.View;

import com.diabin.latte.delegates.LatteDelegate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ExamlpleDelegate extends LatteDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {

    }
}
