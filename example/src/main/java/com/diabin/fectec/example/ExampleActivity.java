package com.diabin.fectec.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.diabin.latte.activities.ProxyActivity;
import com.diabin.latte.app.Latte;
import com.diabin.latte.delegates.LatteDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExamlpleDelegate();
    }


    @Override
    public void post(Runnable runnable) {

    }
}
