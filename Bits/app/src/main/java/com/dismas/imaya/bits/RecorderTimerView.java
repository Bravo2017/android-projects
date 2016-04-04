package com.dismas.imaya.bits;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by imaya on 4/4/16.
 */
public class RecorderTimerView extends TextView {
    private static final long LIVE_REFRESH_INTERVAL = 100;
    private static final long IDLE_REFRESH_INTERVAL = 1000;
    private int volumePercentage = 0;
    private InstrumentedRecorder recorder;
    private String mTimerFormat;



    public RecorderTimerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initResources();
        updateTimer();
    }

    public RecorderTimerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initResources();
        updateTimer();
    }

    public RecorderTimerView(Context context) {
        super(context);
        initResources();
        updateTimer();
    }

    private void initResources() {
        mTimerFormat = getResources().getString(com.dismas.imaya.bits.R.string.timer_format);
    }

    public void setRecorder(InstrumentedRecorder recorder) {
        this.recorder = recorder;
    }

    private void updateTimer() {
        Float time = 0f;
        if (recorder != null && recorder.getState() == InstrumentedRecorder.RECORDING_STATE) {
            time = recorder.progress();
        }
        String timeStr = String.format(mTimerFormat, (int) (time/60), (int) (time%60), (int) (time%1 * 100));
        setText(timeStr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (recorder != null && recorder.getState() == InstrumentedRecorder.RECORDING_STATE) {
            updateTimer();
            postInvalidateDelayed(LIVE_REFRESH_INTERVAL);
        }
        else {
            postInvalidateDelayed(IDLE_REFRESH_INTERVAL);
        }
        super.onDraw(canvas);
    }
}