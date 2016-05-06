package com.dismas.imaya.bash.extractor;

/**
 * Created by imaya on 5/5/16.
 */
public class VideoStream {
    //url of the stream
    public String url = "";
    public int format = -1;
    public String resolution = "";

    public VideoStream(String url, int format, String res) {
        this.url = url; this.format = format; resolution = res;
    }

    // reveals wether two streams are the same, but have diferent urls
    public boolean equalStats(VideoStream cmp) {
        return format == cmp.format
                && resolution == cmp.resolution;
    }

    // revelas wether two streams are equal
    public boolean equals(VideoStream cmp) {
        return cmp != null && equalStats(cmp)
                && url == cmp.url;
    }
}
