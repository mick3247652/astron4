package com.app.astron.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.app.astron.R;
import com.app.astron.utils.ThemeHelper;

import static com.app.astron.ui.XmppActivity.configureActionBar;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTheme(ThemeHelper.find(this));

        setContentView(R.layout.activity_about);
        setSupportActionBar(findViewById(R.id.toolbar));
        configureActionBar(getSupportActionBar());
        setTitle(getString(R.string.title_activity_about_x, getString(R.string.app_name
        )));
    }
}
