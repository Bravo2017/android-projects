package com.dismas.imaya.scroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.minoon.disco.Disco;
import com.minoon.disco.ViewParam;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Disco disco = new Disco();
        disco.addScrollView(mRecyclerView);

        disco.addScrollObserver(mToolbar, disco.getScrollChoreographyBuilder()
                        .onScrollVertical()
                        .multiplier(0.7f)
                        .alpha(1f, 0.7f)
                        .end()
                        .build()
        );

        disco.addViewObserver(mToolbar, mButton, disco.getViewChaseChoreographyBuilder()
                        .onChange(ViewParam.TRANSLATION_Y, 0, -200)
                        .alpha(0f, 1f)
                        .end()
                        .build()
        );

        setContentView(R.layout.main);
    }
}
