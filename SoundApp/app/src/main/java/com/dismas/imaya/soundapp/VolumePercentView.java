package com.dismas.imaya.soundapp;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by imaya on 3/31/16.
 */
public class VolumePercentView extends TextView {
    private static final float MAX_POSSIBLE_AMPLITUDE = 32768F;
    private static final long IDLE_REFRESH_INTERVAL = 1000;
    private static final long LIVE_REFRESH_INTERVAL = 100;
    private int volumePercentage = 0;
    private InstrumentedRecorder recorder;

    public VolumePercentView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setPercentageText();
    }

    public VolumePercentView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPercentageText();
    }

    public VolumePercentView(Context context) {
        super(context);
        setPercentageText();
    }

    public void setRecorder(InstrumentedRecorder recorder) {
        this.recorder = recorder;
    }

    private void setPercentageText() {
        if (recorder != null && recorder.getState() == InstrumentedRecorder.RECORDING_STATE) {
            float volumePercentageDouble = (recorder.getMaxAmplitude() / MAX_POSSIBLE_AMPLITUDE) * 100;
            volumePercentage = Math.round(volumePercentageDouble);
        }
        setText(volumePercentage + "%");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (recorder != null && recorder.getState() == InstrumentedRecorder.RECORDING_STATE) {
            setPercentageText();
            postInvalidateDelayed(LIVE_REFRESH_INTERVAL);
        }
        else {
            postInvalidateDelayed(IDLE_REFRESH_INTERVAL);
        }
        super.onDraw(canvas);
    }
}
