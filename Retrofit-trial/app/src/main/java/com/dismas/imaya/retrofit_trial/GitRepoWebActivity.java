package com.dismas.imaya.retrofit_trial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by imaya on 4/18/16.
 */
public class GitRepoWebActivity extends Activity {
    @Bind(R.id.webview)
    WebView browser;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.repo_webview);
        ButterKnife.bind(this);

        Intent i = getIntent();
        String url = i.getStringExtra("url");
        browser.loadUrl(url);
    }
}
