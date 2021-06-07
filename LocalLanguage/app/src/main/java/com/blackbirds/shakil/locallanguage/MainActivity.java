package com.blackbirds.shakil.locallanguage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.ConfigurationCompat;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView txtLocalLanguage, txtLocalLanguageCode;
    Locale locale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLocalLanguage = findViewById(R.id.txtLocalLanguage);
        txtLocalLanguageCode = findViewById(R.id.txtLocalLanguageCode);
        Locale locale = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration()).get(0);

        txtLocalLanguage.setText(locale.getDisplayName());
        txtLocalLanguageCode.setText(locale.getLanguage());
    }
}