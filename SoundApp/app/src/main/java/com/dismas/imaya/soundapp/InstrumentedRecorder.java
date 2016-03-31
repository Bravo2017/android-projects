package com.dismas.imaya.soundapp;

import android.media.MediaRecorder;

import java.io.IOException;

/**
 * Created by imaya on 3/31/16.
 */
public class InstrumentedRecorder extends MediaRecorder {
    private int state = IDLE_STATE;

    private long startTime;

    public static final int IDLE_STATE = 0;
    public static final int RECORDING_STATE = 1;
    public static final int PLAYING_STATE = 2;

    @Override
    public void prepare() throws IllegalStateException, IOException {
        super.prepare();
    }

    @Override
    public void start() throws IllegalStateException {
        state=RECORDING_STATE;
        startTime = System.currentTimeMillis();
        super.start();
        super.getMaxAmplitude();
    }

    @Override
    public void stop() throws IllegalStateException {
        state=IDLE_STATE;
        super.stop();
    }

    public int getState() {
        return state;
    }

    public float progress() {
        if (state == RECORDING_STATE) {
            return (float) ((System.currentTimeMillis() - startTime)/1000);
        }

        return 0F;
    }


}
