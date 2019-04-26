package com.ru.astron.ui;

import android.annotation.TargetApi;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ru.astron.R;
import com.ru.astron.databinding.ActivityWebViewBinding;
import com.ru.astron.ui.util.MenuDoubleTabUtil;

import static com.ru.astron.ui.ActionBarActivity.configureActionBar;

public class WebViewActivity extends AppCompatActivity {

    private ActivityWebViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding = DataBindingUtil.setContentView(this, R.layout.activity_web_view);
        Toolbar toolbar = (Toolbar) binding.toolbar;
        setSupportActionBar(toolbar);
        configureActionBar(getSupportActionBar());
        setTitle(getResources().getString(R.string.title_action_donate));


        WebViewClient webViewClient = new WebViewClient() {
            @SuppressWarnings("deprecation") @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            @TargetApi(Build.VERSION_CODES.N) @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return true;
            }
        };

        binding.webView.setWebViewClient(webViewClient);
        binding.webView.getSettings().setJavaScriptEnabled(true);
        binding.webView.loadUrl("https://yasobe.ru/na/astron2");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (MenuDoubleTabUtil.shouldIgnoreTap()) {
            return false;
        }
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
