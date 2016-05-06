package com.dismas.imaya.bash.extractor;

import android.graphics.Bitmap;

/**
 * Created by imaya on 5/5/16.
 */
public abstract class AbstractVideoInfo {
    public static enum StreamType {
        NONE,   // placeholder to check if stream type was checked or not
        VIDEO_STREAM,
        AUDIO_STREAM,
        LIVE_STREAM,
        AUDIO_LIVE_STREAM,
        FILE
    }

    public StreamType stream_type;
    public int service_id = -1;
    public String id = "";
    public String title = "";
    public String uploader = "";
    public String thumbnail_url = "";
    public Bitmap thumbnail = null;
    public String webpage_url = "";
    public String upload_date = "";
    public long view_count = -1;
}